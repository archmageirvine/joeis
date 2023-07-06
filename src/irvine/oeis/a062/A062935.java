package irvine.oeis.a062;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a038.A038507;

/**
 * A062935 Palindromes of the form n! + 1.
 * @author Sean A. Irvine
 */
public class A062935 extends FilterSequence {

  /** Construct the sequence. */
  public A062935() {
    super(1, new A038507().skip(1), k -> ZUtils.isPalindrome(k, 10));
  }
}

