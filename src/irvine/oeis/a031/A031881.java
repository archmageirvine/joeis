package irvine.oeis.a031;

import irvine.oeis.FilterSequence;

/**
 * A031881 Lucky numbers that are both palindromic and prime.
 * @author Sean A. Irvine
 */
public class A031881 extends FilterSequence {

  /** Construct the sequence. */
  public A031881() {
    super(new A031157(), PALINDROME);
  }
}
