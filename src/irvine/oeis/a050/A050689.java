package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A050689 Sum of digits of composite a(n) equals number of its prime factors, with multiplicity.
 * @author Sean A. Irvine
 */
public class A050689 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() == ZUtils.digitSum(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
