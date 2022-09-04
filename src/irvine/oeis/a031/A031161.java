package irvine.oeis.a031;

import irvine.oeis.base.PalindromeSequence;
import irvine.oeis.a000.A000959;

/**
 * A031161 Palindromic lucky numbers.
 * @author Sean A. Irvine
 */
public class A031161 extends PalindromeSequence {

  /** Construct the sequence. */
  public A031161() {
    super(new A000959());
  }
}
