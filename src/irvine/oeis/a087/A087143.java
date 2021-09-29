package irvine.oeis.a087;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A087143 Numbers n such that sum of digits of n is divisible by digital root of n. 
 * @author Georg Fischer
 */
public class A087143 implements Sequence {

  protected int mN;

  /** Construct the sequence. */
  public A087143() {
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (ZUtils.digitSum(mN) % ZUtils.digitSumRoot(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
