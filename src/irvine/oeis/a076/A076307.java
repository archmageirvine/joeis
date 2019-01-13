package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076307.
 * @author Sean A. Irvine
 */
public class A076307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076307() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 2, 3, 6, 11, 15, 21, 28, 36, 46, 56, 66, 79, 92});
  }
}
