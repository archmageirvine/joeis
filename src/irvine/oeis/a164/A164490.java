package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164490.
 * @author Sean A. Irvine
 */
public class A164490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164490() {
    super(new long[] {-1, 2, -2, 0, 2}, new long[] {13, 21, 32, 50, 76});
  }
}
