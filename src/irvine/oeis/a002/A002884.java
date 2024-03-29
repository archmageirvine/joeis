package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002884 Number of nonsingular n X n matrices over GF(2) (order of the group GL(n,2)); order of Chevalley group A_n (2); order of projective special linear group PSL_n(2).
 * @author Sean A. Irvine
 */
public class A002884 extends AbstractSequence {

  /** Construct the sequence. */
  public A002884() {
    super(0);
  }

  protected int mN = -1;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mP = mP.multiply(Z.ONE.shiftLeft(mN).subtract(1));
    }
    return mP.shiftLeft(((long) mN * mN - mN) / 2);
  }
}
