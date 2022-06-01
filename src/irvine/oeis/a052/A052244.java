package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052244 Partial sums of A014827.
 * @author Sean A. Irvine
 */
public class A052244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052244() {
    super(new long[] {-5, 16, -18, 8}, new long[] {1, 8, 46, 240});
  }
}
