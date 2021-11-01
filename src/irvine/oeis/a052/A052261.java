package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.LimitedSumOfLikePowersSequence;
import irvine.oeis.Sequence;

/**
 * A052261 Smallest integer that can be expressed as the sum of n squares of positive integers in exactly n distinct ways, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A052261 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return new LimitedSumOfLikePowersSequence(2, ++mN, mN, true, false).next();
  }
}
