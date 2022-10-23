package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007888 Euler characteristic of mapping class group Gamma_n.
 * @author Sean A. Irvine
 */
public class A007888 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Z Z12 = Z.valueOf(12);
  private static final Q Q12 = new Q(-1, 12);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final ArrayList<Q> mBernoulli = new ArrayList<>();
  private final BernoulliSequence mBernoulliSequence = new BernoulliSequence(0);
  private int mN = -2;

  private Q bern(final int n) {
    while (n >= mBernoulli.size()) {
      mBernoulli.add(mBernoulliSequence.nextQ());
      mBernoulliSequence.nextQ(); // skip odd terms
    }
    return mBernoulli.get(n);
  }

  private Q chi(final int g, final int s) {
    assert g >= 0;
    assert s >= 0;
    if (g == 0) {
      if (s <= 3) {
        return Q.ONE;
      }
      final Q f = new Q(mF.factorial(s - 3));
      return (s & 1) == 0 ? f.negate() : f;
    } else if (g == 1) {
      if (s <= 1) {
        return Q12;
      }
      final Z f = mF.factorial(s - 1);
      return new Q((s & 1) == 0 ? f : f.negate(), Z12);
    } else {
      final Q t = bern(g).multiply(mF.factorial(2 * g + s - 3)).divide(2L * g).divide(mF.factorial(2 * g - 2));
      return (s & 1) == 0 ? t : t.negate();
    }
  }

  private Polynomial<Q> beta(final int k, final int d) {
    Polynomial<Q> res = RING.zero();
    for (final Z ll : Jaguar.factor(k).divisors()) {
      final int l = ll.intValue();
      if (l != k) {
        final int dp = d / IntegerUtils.gcd(d, l);
        final int mobius = Mobius.mobius(dp);
        if (mobius != 0) {
          final Q phi = new Q(LongUtils.phi(k / l), LongUtils.phi(dp));
          res = RING.signedAdd(mobius > 0, res, RING.monomial(phi, k - l));
        }
      }
    }
    //System.out.println("beta(" + k + "," + d + ")=" + res);
    return res;
  }

  private int[] down(final Z[] d) {
    final int[] res = new int[d.length];
    for (int k = 0; k < d.length; ++k) {
      res[k] = d[k].intValue();
    }
    return res;
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN <= 2) {
      return Z.ONE;
    }
    Polynomial<Q> gf = RING.zero();
    for (int k = 1; k <= 3 * mN + 2; ++k) {
      final int[] dk = down(Jaguar.factor(k).divisors());
      for (final int m : dk) {
        for (final int d : dk) {
          final Polynomial<Q> beta = beta(k / m, d / IntegerUtils.gcd(d, m)).substitutePower(m);
          for (int h = 0; k * (2 * h - 2) <= mN; ++h) {
            final int pow = 2 * h - 2;
            for (int s = 0; s * m <= 3 * mN; ++s) {
              if (s + 2 * h >= 3 && (s == 0 || !RING.zero().equals(beta))) {
                final int mobius = Mobius.mobius(m);
                if (mobius != 0) {
                  final Polynomial<Q> betaPow = RING.pow(beta, s, mN - k * pow);
                  final Q chi = chi(h, s).divide(mF.factorial(s)).multiply(mobius);
                  final Q u = new Q(k, m).pow(pow);
                  final Q c = chi.divide(m * (long) m).multiply(LongUtils.phi(d)).multiply(u);
                  final Polynomial<Q> t = RING.multiply(betaPow, c).shift(k * pow).truncate(mN);
                  gf = RING.add(gf, t);
                }
              }
            }
          }
        }
      }
    }
    //System.out.println(gf);
    return gf.coeff(mN).toZ();
  }
}
