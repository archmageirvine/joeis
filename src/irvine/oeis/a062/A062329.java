package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A062329 A062329 a(n) = (sum of digits of n) - (product of digits of n).
 * @author Georg Fischer
 */
public class A062329 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.digitSum(mN) - ZUtils.digitProduct(mN));
  }
}
