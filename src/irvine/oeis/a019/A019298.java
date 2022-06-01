package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019298 Number of balls in pyramid with base either a regular hexagon or a hexagon with alternate sides differing by 1 (balls in hexagonal pyramid of height n taken from hexagonal close-packing).
 * @author Sean A. Irvine
 */
public class A019298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019298() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 4, 11, 23});
  }
}
