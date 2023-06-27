package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162849 Pairs of numbers that add up to the 'backward decimal expansion' of fraction 1/109 and whose difference is the 'backward decimal expansion' of fraction 1/89.
 * @author Sean A. Irvine
 */
public class A162849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162849() {
    super(1, new long[] {9900, 0, -10100, 0, 201, 0}, new long[] {0, 1, 10, 101, 2010, 10201});
  }
}
