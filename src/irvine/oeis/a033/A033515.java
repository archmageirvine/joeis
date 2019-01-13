package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033515.
 * @author Sean A. Irvine
 */
public class A033515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033515() {
    super(new long[] {-1, 0, 9, 6}, new long[] {1, 4, 32, 228});
  }
}
