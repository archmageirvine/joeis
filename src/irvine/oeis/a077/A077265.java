package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077265 Number of cycles in the n-th order prism graph.
 * @author Sean A. Irvine
 */
public class A077265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077265() {
    super(3, new long[] {-2, 7, -9, 5}, new long[] {14, 28, 52, 94});
  }
}
