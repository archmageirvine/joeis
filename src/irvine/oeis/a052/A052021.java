package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A052021 Sum of digits of n is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A052021 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long sum = ZUtils.digitSum(++mN);
      if (mN % sum == 0) {
        final Z[] p = Jaguar.factor(mN).toZArray();
        if (p[p.length - 1].equals(Z.valueOf(sum))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
