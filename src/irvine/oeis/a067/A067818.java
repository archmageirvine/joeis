package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067818 Start with 1. To get a(n+1), describe a(n) in terms of the number of 0's, 1's, 2's,...,9's it has. Do not ignore leading 0's in the computation, but ignore them when listing the terms.
 * @author Sean A. Irvine
 */
public class A067818 extends Sequence1 {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
    } else {
      final int[] cnts = new int[10];
      for (int k = 0; k < mA.length(); ++k) {
        ++cnts[mA.charAt(k) - '0'];
      }
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < cnts.length; ++k) {
        sb.append(cnts[k]).append(k);
      }
      mA = sb.toString();
    }
    return new Z(mA);
  }
}
