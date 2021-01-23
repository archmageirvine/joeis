package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164265 Partial sums of A162766.
 * @author Sean A. Irvine
 */
public class A164265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164265() {
    super(new long[] {-3, 3, 1}, new long[] {4, 7, 19});
  }
}
