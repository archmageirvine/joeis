package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066804 Sum of diagonal elements and those below it for a square matrix of integers, starting with 1.
 * @author Sean A. Irvine
 */
public class A066804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066804() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 34, 100, 235});
  }
}
