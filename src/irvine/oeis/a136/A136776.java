package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136776.
 * @author Sean A. Irvine
 */
public class A136776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136776() {
    super(new long[] {-1, -3, 4}, new long[] {1, 2, 6});
  }
}
