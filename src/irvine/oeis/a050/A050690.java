package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A050690 Sum of digits of zero-absent composite a(n) equals number of prime factors.
 * @author Sean A. Irvine
 */
public class A050690 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() == ZUtils.digitSum(mN) && !String.valueOf(mN).contains("0")) {
        return Z.valueOf(mN);
      }
    }
  }
}
