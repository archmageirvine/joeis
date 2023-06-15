package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064152 Erdos primes: primes p such that all p-k! for 1&lt;=k!&lt;p are composite.
 * @author Sean A. Irvine
 */
public class A064154 extends Sequence1 {

  private long mN = -1;
  private long mDigits = 1;
  private long mLimit = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLimit) {
        mLimit *= 10;
        ++mDigits;
      }
      if (ZUtils.digitProduct(mN) == ZUtils.digitSum(mN) * mDigits) {
        return Z.valueOf(mN);
      }
    }
  }
}
