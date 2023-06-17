package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A122693 Bishops on an n X n board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A122693 extends AbstractSequence {

  /** Construct the sequence. */
  public A122693() {
    super(0);
  }

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.valueOf(mN).multiply(mF).shiftLeft(mN - 1);
    } else {
      final int u = (mN + 1) / 2;
      mF = mF.multiply(u).multiply(u);
      return mF.shiftLeft(mN);
    }
  }
}
