package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021023.
 * @author Sean A. Irvine
 */
public class A021023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021023() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 5, 2, 6, 3, 1, 5, 7, 8, 9});
  }
}
