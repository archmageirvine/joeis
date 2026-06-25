package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.LimitedSumOfLikePowersSequence;
import irvine.oeis.Sequence1;

/**
 * A085559 Smallest number expressible as the sum of three 4th powers in at least n ways.
 * @author Sean A. Irvine
 */
public class A085559 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return new LimitedSumOfLikePowersSequence(4, 3, mN, 0, false, false).next();
  }
}
