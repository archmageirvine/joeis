package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164497.
 * @author Sean A. Irvine
 */
public class A164497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164497() {
    super(new long[] {1, 1, -2, 0, 2}, new long[] {13, 21, 34, 54, 87});
  }
}
