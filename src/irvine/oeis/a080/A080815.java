package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080815 Successive strings in the construction of the Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A080815 extends Sequence1 {

  private StringBuilder mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder("1");
    } else {
      final StringBuilder t = new StringBuilder();
      for (int k = 0; k < mA.length(); ++k) {
        if (mA.charAt(k) == '1') {
          t.append("12");
        } else {
          t.append("21");
        }
      }
      mA = t;
    }
    return new Z(mA.substring(mA.length() / 2));
  }
}

