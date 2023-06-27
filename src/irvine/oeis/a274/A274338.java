package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274338 The period 10 sequence of the iterated sum of deficient divisors function (A187793) starting at 52.
 * @author Sean A. Irvine
 */
public class A274338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274338() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {52, 98, 171, 260, 308, 336, 76, 140, 78, 84});
  }
}
