package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164502.
 * @author Sean A. Irvine
 */
public class A164502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164502() {
    super(new long[] {1, 0, 1, -2, 0, 2}, new long[] {13, 20, 31, 48, 74, 114});
  }
}
