package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180926 Numbers k such that 6*k and 10*k are triangular numbers.
 * @author Sean A. Irvine
 */
public class A180926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180926() {
    super(new long[] {1, -63, 63}, new long[] {0, 1, 63});
  }
}
