package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000455.
 * @author Sean A. Irvine
 */
public class A000455 implements Sequence {

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
