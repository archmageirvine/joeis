package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100545.
 * @author Sean A. Irvine
 */
public class A100545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100545() {
    super(new long[] {-1, 3}, new long[] {7, 19});
  }
}
