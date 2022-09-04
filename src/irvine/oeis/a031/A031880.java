package irvine.oeis.a031;

import irvine.oeis.base.PalindromeSequence;

/**
 * A031880 Lucky numbers that are both palindromic and nonprime.
 * @author Sean A. Irvine
 */
public class A031880 extends PalindromeSequence {

  /** Construct the sequence. */
  public A031880() {
    super(new A031879());
  }
}
