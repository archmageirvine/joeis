package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005337 Number of ways in which n identical balls can be distributed among 4 boxes in a row such that each pair of adjacent boxes contains at least 4 balls.
 * @author Sean A. Irvine
 */
public class A005337 extends AbstractSequence {

  /* Construct the sequence. */
  public A005337() {
    super(8);
  }

  private Z mN = Z.SEVEN;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(6).multiply(mN).subtract(169).multiply(mN).add(546).divide(6);
  }
}
