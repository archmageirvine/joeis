package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212744.
 * @author Sean A. Irvine
 */
public class A212744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212744() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 8, 34, 83, 181, 314, 532});
  }
}
