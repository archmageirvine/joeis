package irvine.oeis.a040;
// manually 2021-03-04

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A040997 Absolute value of first digit of n minus sum of other digits of n.
 * @author Georg Fischer
 */
public class A040997 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf((String.valueOf(mN).charAt(0) - '0') << 1).subtract(Functions.DIGIT_SUM.l(10, mN)).abs();
  }
}
