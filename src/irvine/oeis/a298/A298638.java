package irvine.oeis.a298;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A298638 Numbers k such that the digital sum of k and the digital root of k have opposite parity. 
 * @author Georg Fischer
 */
public class A298638 extends Sequence1 {

  protected int mN;

  /** Construct the sequence. */
  public A298638() {
    mN = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (ZUtils.digitSum(mN) % 2 != ZUtils.digitSumRoot(mN) % 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
