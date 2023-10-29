package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066568 a(n) = n - sum of digits of n.
 * @author Sean A. Irvine
 */
public class A066568 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN - ZUtils.digitSum(mN));
  }
}
