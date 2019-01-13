package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A005472.
 * @author Sean A. Irvine
 */
public class A005472 extends A005471 {

  // The results match the table in Shanks as far as it goes.  However, the calculation
  // requires evaluation of an infinite product (and a slowly converging one at that).
  // Caution is needed before using later terms.  Here we use a slowly incrementing
  // limit on how far to evaluate the product.

  private static final double SQRT27 = Math.sqrt(27);
  private static final double ACCURACY_MULTIPLIER = 1.1; // Heuristic
  private final Fast mPrime = new Fast();
  private long mAccuracy = 10000;

  private double theta(final double a) {
    return Math.atan(SQRT27 / (2 * a + 3)) / 3;
  }

  private double rho(final double theta, final double p, final double a) {
    assert theta <= Math.PI / 2;
    assert theta >= -Math.PI / 2;
    return (2 * Math.sqrt(p) * Math.cos(theta) + a) / 3;
  }

  private double regulator(final double rho) {
    final double arho = Math.abs(rho);
    final double brho = Math.abs(1 - rho);
    final double u = Math.log(arho);
    final double v = Math.log(brho);
    return u * u - u * v + v * v;
  }

  private double f(final long p, final long limit) {
    double f = 1;
    for (long q = 2; q <= limit; q = mPrime.nextPrime(q)) {
      if (q != p) {
        if (LongUtils.modPow(q, (p - 1) / 3, p) == 1) {
          final double r = q / (double) (q - 1);
          f *= r * r;
        } else {
          final double q2 = q * (double) q;
          f *= q2 / (q2 + q + 1);
        }
      }
    }
    return f;
  }

  @Override
  public Z next() {
    final Z p = super.next();
    final double a = mN.doubleValue();
    final double theta = theta(a);
    final double rho = rho(theta, p.doubleValue(), a);
    if (rho < 10) {
      return Z.ONE;
    }
    final double r = regulator(rho);
    mAccuracy *= ACCURACY_MULTIPLIER;
    final double f = f(p.longValueExact(), mAccuracy);
    final double h = p.doubleValue() * f / (4 * r);
    //System.out.println("p=" + p.doubleValue() + " a=" + a + " theta=" + theta + " rho=" + rho + " r=" + r + " f=" + f + " h=" + h);
    return Z.valueOf(Math.round(h));
  }
}
