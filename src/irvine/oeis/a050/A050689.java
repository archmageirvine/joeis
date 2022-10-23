package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A050689 Composites whose sum of digits equals number of its prime factors, with multiplicity.
 * @author Sean A. Irvine
 */
public class A050689 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == ZUtils.digitSum(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
