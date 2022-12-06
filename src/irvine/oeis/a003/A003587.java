package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A003587 Roman numerals with 1 letter, in numerical order; then those with 2 letters, etc.
 * @author Sean A. Irvine
 */
public class A003587 extends Sequence1 {

  private int mDigits = 0;
  private int mN = 0;

  @Override
  public Z next() {
    if (mDigits > 15) {
      return null;
    }
    while (true) {
      if (++mN > Math.min(3999, mDigits * 1000)) {
        if (++mDigits > 15) {
          return null;
        }
        mN = 1;
      }
      if (Roman.roman(mN).length() == mDigits) {
        return Z.valueOf(mN);
      }
    }
  }
}
