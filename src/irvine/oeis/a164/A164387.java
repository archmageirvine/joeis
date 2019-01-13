package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164387.
 * @author Sean A. Irvine
 */
public class A164387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164387() {
    super(new long[] {1, 1, 0, 1, 1}, new long[] {1, 2, 4, 8, 14});
  }
}
