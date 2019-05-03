package irvine.oeis.a003;

import java.util.Map;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.PairMultiply;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A003190 Number of connected <code>2-plexes</code>.
 * @author Sean A. Irvine
 */
public class A003190 extends MemoryFunction2<Integer, Q> implements Sequence {

  // This is close, but currently differs from existing sequence in later terms
  // It is unclear if this implementation or the original results are wrong.
  // In particular, for the monomial a_3a_4 I get a_1a_4a_6a_{12}^2, but it
  // looks like the papers has a_1a_2^3a_4^7.  Tracing this further, the
  // difference occurs in the calculation of M2 where I get a_6a_{12}^2 and
  // it apparently should be a_2^3a_4^6.
  //
  // Extra evidence that my implementation is correct comes from A000665 which
  // is the Euler transform of this sequence.

  private int mN = 0;

  static final class SymFn extends MemoryFunction2<Integer, Q> {

    private int b(final int n, final int m) {
      return Binomial.binomial(n, m).intValueExact();
    }

    private MultivariateMonomial m1(final MultivariateMonomial a) {
      final MultivariateMonomial m = new MultivariateMonomial();
      for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
        final int k = e.getKey().right();
        final int jk = e.getValue().intValueExact();
        if (k % 3 == 0) {
          m.add(k / 3, jk);
          m.add(k, jk * k * (k - 3) / 6);
        } else {
          m.add(k, jk * b(k, 3) / k);
        }
      }
      return m;
    }

    private MultivariateMonomial m2(final MultivariateMonomial a) {
      final MultivariateMonomial r = new MultivariateMonomial();
      for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
        final int k = e.getKey().right();
        final int jk = e.getValue().intValueExact();
        r.add(k, k * (k - 1) * b(jk, 2));
        for (final Map.Entry<Pair<String, Integer>, Z> f : a.entrySet()) {
          final int m = f.getKey().right();
          if (m != k) {
            final int jm = f.getValue().intValueExact();
            final int jj = jk * jm;
            if ((k & 1) == 1) {
              r.add(IntegerUtils.lcm(k, m), jj * IntegerUtils.gcd(k, m) * (k - 1) / 2);
            } else {
              r.add(IntegerUtils.lcm(k / 2, m), jj * IntegerUtils.gcd(k / 2, m));
              r.add(IntegerUtils.lcm(k, m), jj * IntegerUtils.gcd(k, m) * (k - 2) / 2);
            }
          }
        }
      }
      return r;
    }

    private MultivariateMonomial m3(final MultivariateMonomial a) {
      final MultivariateMonomial r = new MultivariateMonomial();
      for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
        final int k = e.getKey().right();
        final int jk = e.getValue().intValueExact();
        r.add(k, k * k * b(jk, 3));
        for (final Map.Entry<Pair<String, Integer>, Z> f : a.entrySet()) {
          final int m = f.getKey().right();
          if (m != k) {
            final int jm = f.getValue().intValueExact();
            final int km = k * m;
            final int gcdkm = IntegerUtils.gcd(k, m);
            final int lcmkm = IntegerUtils.lcm(k, m);
            r.add(lcmkm, m * gcdkm * b(jm, 2) * jk);
            if (k < m) {
              for (final Map.Entry<Pair<String, Integer>, Z> g : a.entrySet()) {
                final int t = g.getKey().right();
                if (m < t) {
                  final int jt = g.getValue().intValueExact();
                  final int lcm = IntegerUtils.lcm(lcmkm, t);
                  r.add(lcm, jk * jm * jt * km * t / lcm);
                }
              }
            }
          }
        }
      }
      return r;
    }

    private MultivariateMonomial triple(final MultivariateMonomial a) {
      final MultivariateMonomial m = m1(a);
      m.multiply(m2(a));
      m.multiply(m3(a));
      m.setCoefficient(a.getCoefficient());
      return m;
    }

    private CycleIndex triple(final CycleIndex c) {
      final CycleIndex r = new CycleIndex(c.getName() + "^(3)");
      for (final MultivariateMonomial m : c.values()) {
        r.add(triple(m));
      }
      return r;
    }

    CycleIndex sx(final int n, final int p) {
      final CycleIndex sp = SymmetricGroup.create(p).cycleIndex();
      switch (n) {
        case 1:
          return sp;
        case 2:
          return sp.op(PairMultiply.OP, sp);
        case 3:
          return triple(sp);
        default:
          // A003190 actually only uses n == 2 case
          throw new UnsupportedOperationException();
      }
    }

    private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

    @Override
    protected Q compute(final Integer n, final Integer p) {
      return RING.eval(sx(n + 1, p).applyOnePlusXToTheN(), Q.ONE);
    }
  }

  private final SymFn mSym = new SymFn();

  @Override
  protected Q compute(final Integer n, final Integer p) {
    Q s = Q.ZERO;
    for (int k = 1; k < p; ++k) {
      s = s.add(mSym.get(n, p - k).multiply(get(n, k)).multiply(k));
    }
    return mSym.get(n, p).subtract(s.divide(p));
  }

  private Z c(final int n, final int p) {
    Q s = Q.ZERO;
    for (final Z dd : Cheetah.factor(p).divisors()) {
      final int d = dd.intValueExact();
      s = s.add(get(n, p / d).multiply(Mobius.mobius(d)).divide(d));
    }
    assert s.isInteger();
    return s.toZ();
  }

  @Override
  public Z next() {
    ++mN;
    return c(2, mN);
  }

//  static int j(final int r, final int[] j) {
//    final IntegerPartition pi = new IntegerPartition(r);
//    final int[] i = new int[r + 1];
//    int[] p;
//    int s = 0;
//    while ((p = pi.nextQ()) != null) {
//      IntegerPartition.toCountForm(p, i);
//      int prod = 1;
//      for (int k = 1; k < i.length; ++k) {
//        if (i[k] != 0) {
//          if (j[k] == 0) {
//            prod = 0;
//            break;
//          }
//          prod *= Binomial.binomial(j[k], i[k]).intValueExact();
//        }
//      }
//      //System.out.println(Arrays.toString(i) + " " + prod);
//      s += prod;
//    }
//    return s;
//  }
//
//  static int j(final int m, final int r, final int[] j) {
//    int res = j(r, j);
//    if (m > 1) {
//      int s = 0;
//      for (final Z dd : Cheetah.factor(m).divisors()) {
//        final int d = dd.intValueExact();
//        if (d != m) {
//          s += d * j(d, r, j);
//        }
//      }
//      res -= s / m;
//    }
//    return res;
//  }

}
