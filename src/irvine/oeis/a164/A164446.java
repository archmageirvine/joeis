package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164446.
 * @author Sean A. Irvine
 */
public class A164446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164446() {
    super(new long[] {-1, 1, -1, 0, 1, -1, 2}, new long[] {13, 22, 37, 62, 103, 172, 286});
  }
}
