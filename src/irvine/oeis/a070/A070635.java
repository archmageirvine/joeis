package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A070635 a(n) = n mod (sum of digits of n).
 * @author Georg Fischer
 */
public class A070635 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).mod(Z.valueOf(ZUtils.digitSum(mN)));
  }
}
