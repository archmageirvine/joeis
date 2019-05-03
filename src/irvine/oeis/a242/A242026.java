package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242026 Number of <code>non-palindromic n-tuples</code> of 4 distinct elements.
 * @author Sean A. Irvine
 */
public class A242026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242026() {
    super(new long[] {-16, 4, 4}, new long[] {0, 12, 48});
  }
}
