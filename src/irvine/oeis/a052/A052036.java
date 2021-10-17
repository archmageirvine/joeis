package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A052036 Smallest number that must be added to n to make or keep n palindromic.
 * @author Sean A. Irvine
 */
public class A052036 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (!StringUtils.isPalindrome(String.valueOf(mN + k))) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
