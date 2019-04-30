package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036408 <code>Ceiling(n^2/10)</code>.
 * @author Sean A. Irvine
 */
public class A036408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036408() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 1, 1, 2, 3, 4, 5, 7, 9, 10, 13});
  }
}
