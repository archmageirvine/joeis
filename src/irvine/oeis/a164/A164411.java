package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164411.
 * @author Sean A. Irvine
 */
public class A164411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164411() {
    super(new long[] {1, 0, 0, 1, 1}, new long[] {1, 2, 4, 8, 13});
  }
}
