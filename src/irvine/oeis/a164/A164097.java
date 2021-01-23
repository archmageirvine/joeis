package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164097 Numbers n such that 6n + 7 is a perfect square.
 * @author Sean A. Irvine
 */
public class A164097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164097() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {3, 7, 19, 27, 47});
  }
}
