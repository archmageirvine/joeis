package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243580 Integers of the form 8k + 7 that can be written as a sum of four distinct squares of the form m, m + 1, m + 3, m + 5, where m == 2 (mod 4).
 * @author Sean A. Irvine
 */
public class A243580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243580() {
    super(new long[] {1, -3, 3}, new long[] {87, 287, 615});
  }
}
