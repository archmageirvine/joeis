package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090297.
 * @author Sean A. Irvine
 */
public class A090297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090297() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {42, 462, 1586, 3958, 8330, 15694});
  }
}
