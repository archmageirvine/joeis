package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243581 Integers of the form 8k + 7 that can be written as a sum of four distinct squares of the form m, m + 2, m + 3, m + 4, where m == 2 (mod 4).
 * @author Sean A. Irvine
 */
public class A243581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243581() {
    super(new long[] {1, -3, 3}, new long[] {119, 351, 711});
  }
}
