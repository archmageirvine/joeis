package irvine.oeis.a062;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a068.A068601;

/**
 * A062841 Palindromes of the form k^3-1.
 * @author Sean A. Irvine
 */
public class A062841 extends FilterSequence {

  /** Construct the sequence. */
  public A062841() {
    super(1, new A068601(), k -> ZUtils.isPalindrome(k, 10));
  }
}
