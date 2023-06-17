package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000455 Digits of powers of 2.
 * @author Sean A. Irvine
 */
public class A000455 extends AbstractSequence {

  /* Construct the sequence. */
  public A000455() {
    super(0);
  }

  private String mCurrent = "";
  private int mPos = 0;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mPos >= mCurrent.length()) {
      mCurrent = Z.ONE.shiftLeft(++mN).toString();
      mPos = 0;
    }
    return Z.valueOf(mCurrent.charAt(mPos) - '0');
  }
}
