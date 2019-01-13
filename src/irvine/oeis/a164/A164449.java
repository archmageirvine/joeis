package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164449.
 * @author Sean A. Irvine
 */
public class A164449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164449() {
    super(new long[] {-1, 0, 1, -1, 2}, new long[] {13, 21, 34, 56, 91});
  }
}
