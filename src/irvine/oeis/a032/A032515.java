package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032515 Sum of the integer part of 5/2-th roots of integers less than or equal to n.
 * @author Sean A. Irvine
 */
public class A032515 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mSum = mSum.add(mN.square().root(5));
    return mSum;
  }
}
