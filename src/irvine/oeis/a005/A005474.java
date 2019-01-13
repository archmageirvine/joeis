package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A005474.
 * @author Sean A. Irvine
 */
public class A005474 extends A005473 {

  // The results match the table in Shanks as far as it goes.  However, the calculation
  // requires evaluation of an infinite product (and a slowly converging one at that).
  // Caution is needed before using later terms.  Here we use a slowly incrementing
  // limit on how far to evaluate the product.

  private static final double ACCURACY_MULTIPLIER = 1.1; // Heuristic
  private final Fast mPrime = new Fast();
  private long mAccuracy = 5000;

  private double f(final long p, final long limit) {
    double f = 1;
    for (long q = 2; q <= limit; q = mPrime.nextPrime(q)) {
      if (q == p) {
        f *= 1;
      } else if (LongUtils.modPow(q, (p - 1) / 2, p) == 1) {
        f *= q / (double) (q - 1);
      } else {
        f *= q / (double) (q + 1);
      }
    }
    return f;
  }

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.FIVE.equals(p)) {
      return Z.ONE;
    }
    final double a = mN.doubleValue();
    mAccuracy *= ACCURACY_MULTIPLIER;
    final double f = f(p.longValueExact(), mAccuracy);
    final double s = Math.sqrt(p.doubleValue()) / (2 * Math.log(a));
    final double t = s * (1 - 1 / (a * a * Math.log(a)));
    final double h = t * f;
    return Z.valueOf(Math.round(h));
  }
}
