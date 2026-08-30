package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086378 Sum of successive remainders in computing Euclidean algorithm for (1,1/sqrt(n)) is rational.
 * @author Sean A. Irvine
 */
public class A086378 extends Sequence0 {

  /**
   * An element of Q(sqrt(n)), represented as (a + b sqrt(n)) / d with d > 0.
   */
  private static final class Quad {
    private final Z mA;
    private final Z mB;
    private final Z mD;
    private final Z mN;

    private Quad(final Z a, final Z b, final Z d, final Z n) {
      if (d.signum() == 0) {
        throw new ArithmeticException("zero denominator");
      }
      if (d.signum() < 0) {
        mA = a.negate();
        mB = b.negate();
        mD = d.negate();
      } else {
        mA = a;
        mB = b;
        mD = d;
      }
      mN = n;
    }

    private Quad(final long a, final long b, final long d, final long n) {
      this(Z.valueOf(a), Z.valueOf(b),  Z.valueOf(d), Z.valueOf(n));
    }

    private Quad add(final Quad x) {
      return new Quad(mA.multiply(x.mD).add(x.mA.multiply(mD)), mB.multiply(x.mD).add(x.mB.multiply(mD)), mD.multiply(x.mD), mN).reduce();
    }

    private Quad subtract(final Z x) {
      return new Quad(mA.subtract(x.multiply(mD)), mB, mD, mN).reduce();
    }

    private Quad multiply(final Quad x) {
      return new Quad(mA.multiply(x.mA).add(mB.multiply(x.mB).multiply(mN)), mA.multiply(x.mB).add(mB.multiply(x.mA)), mD.multiply(x.mD), mN).reduce();
    }

    private Quad reciprocal() {
      final Z den = mA.multiply(mA).subtract(mB.multiply(mB).multiply(mN));
      return new Quad(mD.multiply(mA), mD.multiply(mB).negate(), den, mN).reduce();
    }

    /*
     * Exact floor.
     * We find a nearby integer using double precision and then correct
     * it using exact comparisons in Q(sqrt(n)).
     */
    private Z floor() {
      final double x = (mA.doubleValue() + mB.doubleValue() * Math.sqrt(mN.doubleValue())) / mD.doubleValue();
      Z k = Z.valueOf((long) Math.floor(x));
      while (compareToInteger(k) < 0) {
        k = k.subtract(Z.ONE);
      }
      while (compareToInteger(k.add(Z.ONE)) >= 0) {
        k = k.add(Z.ONE);
      }
      return k;
    }

    /*
     * Compare this number with the integer k.
     * Returns <0, =0, >0 according as this < k, this = k, this > k.
     */
    private int compareToInteger(final Z k) {
      // Sign of
      //
      //     (a-k*d) + b*sqrt(n).
      //
      // This can be determined exactly by squaring when the two terms have opposite signs.
      final Z a = mA.subtract(k.multiply(mD));
      if (mB.signum() == 0) {
        return a.signum();
      }
      if (a.signum() == 0) {
        return mB.signum();
      }
      if (a.signum() == mB.signum()) {
        return a.signum();
      }
      final int cmp = mB.abs().multiply(mB.abs()).multiply(mN).compareTo(a.abs().multiply(a.abs()));
      if (cmp == 0) {
        return 0;
      }

      // A and b have opposite signs.
      // The term with the larger absolute value determines the sign.
      if (mB.signum() > 0) {
        return cmp > 0 ? 1 : -1;
      } else {
        return cmp > 0 ? -1 : 1;
      }
    }

    // Remove common factors from a, b and d
    private Quad reduce() {
      final Z g = mA.abs().gcd(mB.abs()).gcd(mD);
      if (!g.equals(Z.ONE)) {
        return new Quad(mA.divide(g), mB.divide(g), mD.divide(g), mN);
      }
      return this;
    }

    private boolean isRational() {
      return mB.signum() == 0;
    }

    private Z rationalNumerator() {
      if (!isRational()) {
        throw new ArithmeticException("not rational");
      }
      return mA;
    }

    private Z rationalDenominator() {
      if (!isRational()) {
        throw new ArithmeticException("not rational");
      }
      return mD;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Quad)) {
        return false;
      }
      final Quad x = (Quad) obj;
      return mA.equals(x.mA) && mB.equals(x.mB) && mD.equals(x.mD) && mN.equals(x.mN);
    }

    @Override
    public int hashCode() {
      return mA.hashCode() ^ mB.hashCode() ^ mD.hashCode() ^ mN.hashCode();
    }
  }

  private long mN = 0;

  private static Z kappa(final long nn) {
    final Z n = Z.valueOf(nn);
    final long sLong = Functions.SQRT.l(nn);
    // sqrt(n) - floor(sqrt(n))
    if (sLong * sLong == nn) {
      return Z.ZERO;
    }
    final Z s = Z.valueOf(sLong);

    // a = 1/(sqrt(n)-s) = (sqrt(n)+s)/(n-s^2).
    Quad a = new Quad(s, Z.ONE, n.subtract(s.multiply(s)), n);
    final Quad i = a;
    Quad p = new Quad(1L, 0L, 1L, nn);
    Quad b = new Quad(0L, 0L, 1L, nn);
    do {
      p = p.multiply(a);
      b = b.multiply(a).add(a.subtract(a.floor()));
      a = a.subtract(a.floor()).reciprocal();
    } while (!a.equals(i));

    /*
     * result = (b/(p-1) + 1/a) / sqrt(n).
     * First compute b/(p-1) by multiplying b by 1/(p-1).
     */
    final Quad pMinusOne = p.subtract(Z.ONE);
    final Quad term1 = b.multiply(pMinusOne.reciprocal());
    final Quad term2 = a.reciprocal();
    final Quad numerator = term1.add(term2);

    /*
     * Divide by sqrt(n):
     *   (A+B sqrt(n))/D / sqrt(n) = B/D + A/(D sqrt(n)) = B/D + A sqrt(n)/(D*n).
     * Thus the result is rational precisely when A == 0.
     */
    final Quad result = new Quad(numerator.mB, numerator.mA, numerator.mD.multiply(n), n).reduce();

    if (!result.isRational()) {
      // A086378 only asks for the cases where the expression is rational.
      return null;
    }
    return result.rationalNumerator().divide(result.rationalDenominator());
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z k = kappa(mN);
      if (k != null) {
        return Z.valueOf(mN);
      }
    }
  }
}

