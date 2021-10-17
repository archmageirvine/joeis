package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052018 Numbers n with property that the sum of the digits of n is substring of n.
 * @author Sean A. Irvine
 */
public class A052018 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long sum = ZUtils.digitSum(++mN);
      if (String.valueOf(mN).contains(String.valueOf(sum))) {
        return Z.valueOf(mN);
      }
    }
  }
}
