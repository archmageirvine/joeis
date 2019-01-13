package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164552.
 * @author Sean A. Irvine
 */
public class A164552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164552() {
    super(new long[] {-30, 12}, new long[] {1, 10});
  }
}
