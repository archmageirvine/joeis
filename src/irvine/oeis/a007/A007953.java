package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007953 Digital sum (i.e., sum of digits) of n; also called digsum(n).
 * @author Sean A. Irvine
 */
public class A007953 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(++mN));
  }
}
