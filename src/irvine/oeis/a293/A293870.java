package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A293870 Numbers having '10' as substring of their digits.
 * @author Georg Fischer
 */
public class A293870 extends Sequence1 {

  private Z mN = Z.NINE;
  private String mSubstr;

  /** Construct the sequence. */
  public A293870() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param substr desired pair of digits
   */
  public A293870(final int substr) {
    mSubstr = String.valueOf(substr);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.toString().indexOf(mSubstr) >= 0) {
        return mN;
      }
    }
  }
}
