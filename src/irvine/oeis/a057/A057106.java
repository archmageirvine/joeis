package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000567;
import irvine.util.string.StringUtils;

/**
 * A057106 Numbers k such that k(3k-2) is an octagonal palindrome.
 * @author Sean A. Irvine
 */
public class A057106 extends A000567 {

  /** Construct the sequence. */
  public A057106() {
    super(1);
  }

  @Override
  public Z next() {
    while (!StringUtils.isPalindrome(super.next().toString())) {
      // do nothing
    }
    return mN;
  }
}
