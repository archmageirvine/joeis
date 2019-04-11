package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004071 Start with <code>a(0)=1</code>; replace each i with 12...i, then add 1 to final digit.
 * @author Sean A. Irvine
 */
public class A004071 implements Sequence {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
    } else {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < mA.length(); ++k) {
        final int limit = mA.charAt(k) - '0';
        for (int i = 1; i <= limit; ++i) {
          sb.append(k == mA.length() - 1 && i == limit ? i + 1 : i);
        }
      }
      mA = sb.toString();
    }
    return new Z(mA);
  }

}
