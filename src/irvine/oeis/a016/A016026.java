package irvine.oeis.a016;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016026 Smallest base relative to which n is palindromic.
 * @author Sean A. Irvine
 */
public class A016026 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int base = 1;
    while (true) {
      if (LongUtils.isPalindrome(mN, ++base)) {
        return Z.valueOf(base);
      }
    }
  }
}
