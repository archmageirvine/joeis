package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107857.
 * @author Sean A. Irvine
 */
public class A107857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107857() {
    super(new long[] {-1, 1, -4, 4, 1}, new long[] {1, 1, 2, 3, 7});
  }
}
