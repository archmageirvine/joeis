package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A050782 Smallest multiplier m (&gt;0) such that mn is palindromic (or zero if no such m exists).
 * @author Sean A. Irvine
 */
public class A050782 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    long k = 0;
    while (true) {
      if (StringUtils.isPalindrome(n.multiply(++k).toString())) {
        return Z.valueOf(k);
      }
    }
  }
}
