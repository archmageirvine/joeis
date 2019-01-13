package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164495.
 * @author Sean A. Irvine
 */
public class A164495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164495() {
    super(new long[] {1, 0, 1, 0, -1, 2}, new long[] {13, 22, 37, 62, 105, 178});
  }
}
