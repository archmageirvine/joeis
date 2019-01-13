package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030533.
 * @author Sean A. Irvine
 */
public class A030533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030533() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 1, 5, 6, 15, 19});
  }
}
