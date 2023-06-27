package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054420 Number of connectable 3 X n binary matrices.
 * @author Sean A. Irvine
 */
public class A054420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054420() {
    super(1, new long[] {5, -3, 7}, new long[] {1, 3, 13});
  }
}
