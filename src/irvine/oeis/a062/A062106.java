package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062106 Number of ways a black pawn (from any starting square on the second back rank) can (theoretically) end on the n-th square of the leftmost file counted from the back rank.
 * @author Sean A. Irvine
 */
public class A062106 extends A062104 {

  private int mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return mB.get(++mN, 1);
  }
}
