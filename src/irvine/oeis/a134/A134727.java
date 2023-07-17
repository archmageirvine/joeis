package irvine.oeis.a134;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A134727 Successive digits of members of the Padovan sequence A000931(n).
 * @author Georg Fischer
 */
public class A134727 extends A000931 {

  /** Construct the sequence. */
  public A134727() {
    super(1);
  }

  protected String mPadov = ""; // current Padovan number
  protected int mPos = 1; // position in mPadov

  @Override
  public Z next() {
    if (mPos >= mPadov.length()) {
      mPadov = super.next().toString();
      mPos = 0;
    }
    return Z.valueOf(Character.digit(mPadov.charAt(mPos++), 10));
  }
}
