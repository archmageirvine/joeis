package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A084051 Smallest palindrome corresponding to A084050(n).
 * @author Sean A. Irvine
 */
public class A084051 extends A084050 {

  @Override
  public Z next() {
    final Z t = super.next();
    final int[] cnts = ZUtils.digitCounts(t);
    cnts[0] = 0; // Can always treat 0s as left
    int odd = -1;
    for (int k = 0; k < cnts.length; ++k) {
      if ((cnts[k] & 1) == 1) {
        odd = k;
      }
    }
    final StringBuilder left = new StringBuilder();
    for (int k = 1; k < cnts.length; ++k) {
      for (int j = 1; j < cnts[k]; j += 2) {
        left.append(k);
      }
    }
    return odd < 0 ? new Z(left.toString() + left.reverse()) : new Z(left.toString() + odd + left.reverse());
  }
}

