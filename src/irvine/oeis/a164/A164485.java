package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164485.
 * @author Sean A. Irvine
 */
public class A164485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164485() {
    super(new long[] {-1, 0, 2}, new long[] {13, 21, 33});
  }
}
