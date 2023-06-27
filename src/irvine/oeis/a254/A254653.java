package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254653 Indices of centered heptagonal numbers (A069099) which are also pentagonal numbers (A000326).
 * @author Sean A. Irvine
 */
public class A254653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254653() {
    super(1, new long[] {1, -1, -110, 110, 1}, new long[] {1, 3, 58, 276, 6325});
  }
}
