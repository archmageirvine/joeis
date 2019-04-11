package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001370 Sum of digits of <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A001370 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return Z.valueOf(ZUtils.digitSum(mN));
  }
}
