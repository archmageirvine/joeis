package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164483.
 * @author Sean A. Irvine
 */
public class A164483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164483() {
    super(new long[] {1, 0, -3, 2, -1, 2}, new long[] {13, 20, 30, 44, 64, 92});
  }
}
