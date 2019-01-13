package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Roman;

/**
 * A003587.
 * @author Sean A. Irvine
 */
public class A003587 implements Sequence {

  private int mDigits = 0;
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN > mDigits * 1000) {
        ++mDigits;
        mN = 1;
      }
      if (Roman.roman(mN).length() == mDigits) {
        return Z.valueOf(mN);
      }
    }
  }
}
