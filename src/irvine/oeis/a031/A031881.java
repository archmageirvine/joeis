package irvine.oeis.a031;

import irvine.oeis.base.PalindromeSequence;

/**
 * A031881 Lucky numbers that are both palindromic and prime.
 * @author Sean A. Irvine
 */
public class A031881 extends PalindromeSequence {

  /** Construct the sequence. */
  public A031881() {
    super(new A031157());
  }
}
