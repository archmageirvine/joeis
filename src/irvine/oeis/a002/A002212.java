package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002212 Number of restricted hexagonal polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A002212 extends AbstractSequence {

  /* Construct the sequence. */
  public A002212() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(3).multiply(2 * mN - 1).subtract(mA.multiply(5).multiply(mN - 2)).divide(mN + 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
