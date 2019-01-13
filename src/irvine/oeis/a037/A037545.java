package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037545.
 * @author Sean A. Irvine
 */
public class A037545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037545() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 26, 105});
  }
}
