package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087548 Beginning with 1, smallest multiple of n such that a(n)*a(n-1) + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A087548 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      long k = mN;
      while (!mA.multiply(k).add(1).isProbablePrime()) {
        k += mN;
      }
      mA = Z.valueOf(k);
    }
    return mA;
  }
}
