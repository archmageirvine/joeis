package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105968.
 * @author Sean A. Irvine
 */
public class A105968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105968() {
    super(new long[] {-1, 3, 3}, new long[] {1, 4, 13});
  }
}
