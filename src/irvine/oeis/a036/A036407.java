package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036407 <code>Ceiling(n^2/9)</code>.
 * @author Sean A. Irvine
 */
public class A036407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036407() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 1, 1, 2, 3, 4, 6, 8, 9, 12});
  }
}
