package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057082 The next smallest pair of numbers is taken so that a(2n-1)/a(2n) converges to Pi.
 * @author Sean A. Irvine
 */
public class A057082 extends Sequence0 {

  private static final CR PI1 = CR.PI.add(CR.ONE);
  private long mN = 1;
  private CR mBest = CR.FOUR;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB != null) {
      final Z res = mB;
      mB = null;
      return res;
    }
    while (true) {
      ++mN;
      final CR acr = CR.PI.multiply(mN).divide(PI1);
      Z az = acr.round();
      long a = az.longValueExact();
      if (a == mN) {
        a = mN - 1;
        az = az.subtract(1);
      }
      final long b = mN - a;
      if (Functions.GCD.l(a, b) == 1) { // Otherwise we would have achieved this accuracy with smaller n
        final CR diff = CR.PI.subtract(CR.valueOf(az).divide(CR.valueOf(b))).abs();
        if (diff.compareTo(mBest) < 0) {
          mBest = diff;
          mB = Z.valueOf(b);
          return az;
        }
      }
    }
  }
}
