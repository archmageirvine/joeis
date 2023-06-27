package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274340 The period 4 sequence of the iterated sum of deficient divisors function (A187793) starting at 19.
 * @author Sean A. Irvine
 */
public class A274340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274340() {
    super(1, new long[] {1, 0, 0, 0}, new long[] {19, 20, 22, 36});
  }
}
