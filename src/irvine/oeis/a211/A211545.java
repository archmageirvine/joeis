package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211545.
 * @author Sean A. Irvine
 */
public class A211545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211545() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 29, 99});
  }
}
