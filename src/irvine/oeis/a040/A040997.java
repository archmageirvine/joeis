package irvine.oeis.a040;
// manually 2021-03-04

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A040997 Absolute value of first digit of n minus sum of other digits of n.
 * @author Georg Fischer
 */
public class A040997 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf((String.valueOf(mN).charAt(0) - '0') << 1).subtract(ZUtils.digitSum(mN, 10)).abs();
  }
}
