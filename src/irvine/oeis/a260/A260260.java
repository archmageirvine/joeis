package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260260.
 * @author Sean A. Irvine
 */
public class A260260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260260() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 29, 132});
  }
}
