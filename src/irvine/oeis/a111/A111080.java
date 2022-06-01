package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111080 Sum of numbers under a triangle on a spiral staircase of width 10.
 * @author Sean A. Irvine
 */
public class A111080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111080() {
    super(new long[] {-1, 4, -6, 4}, new long[] {11, 44, 110, 220});
  }
}
