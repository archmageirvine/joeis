package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136776 Number of primitive multiplex juggling sequences of length n, base state <code>&lt;1,1&gt;</code> and hand capacity 2.
 * @author Sean A. Irvine
 */
public class A136776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136776() {
    super(new long[] {-1, -3, 4}, new long[] {1, 2, 6});
  }
}
