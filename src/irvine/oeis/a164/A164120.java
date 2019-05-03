package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164120 Partial sums of <code>A162396</code>.
 * @author Sean A. Irvine
 */
public class A164120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164120() {
    super(new long[] {-2, 2, 1}, new long[] {5, 7, 17});
  }
}
