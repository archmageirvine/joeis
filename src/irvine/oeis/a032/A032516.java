package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032516 Sum of the integer part of 7/2-th roots of integers less than n.
 * @author Sean A. Irvine
 */
public class A032516 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mSum = mSum.add(mN.square().root(7));
    return mSum;
  }
}
