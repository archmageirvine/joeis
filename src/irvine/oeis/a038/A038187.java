package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038187 Numbers other than powers of 10 that are coprime to the sum of their digits.
 * @author Sean A. Irvine
 */
public class A038187 implements Sequence {

  private long mN = 10;
  private long mT = 100;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mT) {
        mT *= 10;
      } else {
        final long d = ZUtils.digitSum(mN);
        if (LongUtils.gcd(mN, d) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
