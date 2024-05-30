package irvine.math.polynomial;

import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Symmetric cycle indices <code>Z(S_n^{(m)})</code>.
 * @author Sean A. Irvine
 */
public final class PalmerSymPowerCycleIndex extends MemoryFunction2<Integer, Q> {

  // See Vladeta Jovovic in https://oeis.org/A058790 for general formulation,
  // but note that the definition of "t" given in that document is not quite
  // correct and that the values of "t" should extend up to t_m (m/(m,d))
  // rather than t_n.

  // The general calculation is slower than the special cases we have here
  // for n=1,2,3.

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
        m.add(k, jk * k * (k - 3L) / 6);
      } else {
        m.add(k, (long) jk * b(k, 3) / k);
      }
    }
    return m;
  }

  private MultivariateMonomial m2(final MultivariateMonomial a) {
    final MultivariateMonomial r = new MultivariateMonomial();
    for (final Map.Entry<Pair<String, Integer>, Z> e : a.entrySet()) {
      final int k = e.getKey().right();
      final int jk = e.getValue().intValueExact();
      r.add(k, k * (k - 1L) * b(jk, 2));
      for (final Map.Entry<Pair<String, Integer>, Z> f : a.entrySet()) {
        final int m = f.getKey().right();
        if (m != k) {
          final int jm = f.getValue().intValueExact();
          final int jj = jk * jm;
          if ((k & 1) == 1) {
            r.add(IntegerUtils.lcm(k, m), jj * Functions.GCD.i(k, m) * (k - 1L) / 2);
          } else {
            r.add(IntegerUtils.lcm(k / 2, m), jj * (long) Functions.GCD.i(k / 2, m));
            r.add(IntegerUtils.lcm(k, m), jj * Functions.GCD.i(k, m) * (k - 2L) / 2);
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
      r.add(k, (long) k * k * b(jk, 3));
      for (final Map.Entry<Pair<String, Integer>, Z> f : a.entrySet()) {
        final int m = f.getKey().right();
        if (m != k) {
          final int jm = f.getValue().intValueExact();
          final int km = k * m;
          final int gcdkm = Functions.GCD.i(k, m);
          final int lcmkm = IntegerUtils.lcm(k, m);
          r.add(lcmkm, (long) m * gcdkm * b(jm, 2) * jk);
          if (k < m) {
            for (final Map.Entry<Pair<String, Integer>, Z> g : a.entrySet()) {
              final int t = g.getKey().right();
              if (m < t) {
                final int jt = g.getValue().intValueExact();
                final int lcm = IntegerUtils.lcm(lcmkm, t);
                r.add(lcm, (long) jk * jm * jt * km * t / lcm);
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

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private int lcm(final int[] c) {
    long lcm = 1;
    for (int k = 1; k < c.length; ++k) {
      if (c[k] != 0) {
        lcm = LongUtils.lcm(lcm, k);
        if (lcm > Integer.MAX_VALUE) {
          throw new UnsupportedOperationException();
        }
      }
    }
    return (int) lcm;
  }

  private Z search(final int n, final int d, final int[] c, final int[] u, final int s, final int pos, final Z prod) {
    if (s == n) {
      return prod;
    }
    final int k = pos + 1;
    if (k >= c.length) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int t = 0; s + u[k] * t <= n; ++t) {
      final Z b = Binomial.binomial((long) c[k] * Functions.GCD.i(k, d), t);
      sum = sum.add(search(n, d, c, u, s + u[k] * t, k, prod.multiply(b)));
    }
    return sum;
  }

  private Z f(final int n, final int d, final int[] c) {
    final int[] u = new int[c.length]; // u[0] unused
    for (int k = 1; k < u.length; ++k) {
      u[k] = k / Functions.GCD.i(k, d);
    }
    return search(n, d, c, u, 0, 0, Z.ONE);
  }

  private Z e(final int n, final int i, final int[] c) {
   // System.out.println("Computing e(" + i + ") for n=" + n + " on " + Arrays.toString(c));
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(i).divisors()) {
      final int d = dd.intValue();
      final int mobius = Functions.MOBIUS.i((long) (i / d));
      if (mobius != 0) {
        final Z f = f(n, d, c);
        sum = sum.signedAdd(mobius == 1, f);
      }
    }
    assert sum.mod(i) == 0;
    return sum.divide(i);
  }

  private MultivariateMonomial mm(final int n, final int k, final int[] c) {
    final MultivariateMonomial res = new MultivariateMonomial();
    for (final Z ii : Jaguar.factor(k).divisors()) {
      final int i = ii.intValue();
      final Z e = e(n, i, c);
      res.add(i, e);
    }
    return res;
  }

  private CycleIndex computeCycleIndex(final int n, final int m) {
    final CycleIndex res = new CycleIndex("Z(S_" + m + "^(" + n + "))");
    final IntegerPartition part = new IntegerPartition(m);
    final int[] c = new int[m + 1];
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      //System.out.println("m=" + m + " partition: " + Arrays.toString(p) + " count form: " + Arrays.toString(c) + " k=" + lcm(c));
      final MultivariateMonomial mm = mm(n, lcm(c), c);
      mm.setCoefficient(new Q(Z.ONE, SymmetricGroup.per(c)));
      res.add(mm);
    }
    return res;
  }

  /**
   * Compute <code>Z(S_p^{(n)}</code>.
   * @param n power
   * @param p base
   * @return cycle index
   */
  public CycleIndex cycleIndex(final int n, final int p) {
    final CycleIndex sp = SymmetricGroup.create(p).cycleIndex();
    switch (n) {
      case 1:
        return sp;
      case 2:
        return sp.op(PairMultiply.OP, sp);
      case 3:
        return triple(sp);
      default:
        return computeCycleIndex(n, p);
    }
  }

  @Override
  protected Q compute(final Integer n, final Integer p) {
    return RING.eval(cycleIndex(n + 1, p).applyOnePlusXToTheN(), Q.ONE);
  }
}
