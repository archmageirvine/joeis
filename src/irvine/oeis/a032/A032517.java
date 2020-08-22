package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032517 Sum of the integer part of 9/2-th roots of integers less than n.
 * @author Sean A. Irvine
 */
public class A032517 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mSum = mSum.add(mN.square().root(9));
    return mSum;
  }
}
