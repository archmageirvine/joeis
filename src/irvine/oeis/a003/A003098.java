package irvine.oeis.a003;

import irvine.oeis.PalindromeSequence;
import irvine.oeis.a000.A000217;

/**
 * A003098 Palindromic triangular numbers.
 * @author Sean A. Irvine
 */
public class A003098 extends PalindromeSequence {

  /** Construct the sequence. */
  public A003098() {
    super(new A000217());
  }
}
