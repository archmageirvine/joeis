package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134633.
 * @author Sean A. Irvine
 */
public class A134633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134633() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 192, 1314, 5344, 16050});
  }
}
