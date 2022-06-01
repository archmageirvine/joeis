package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080806 Positive integer values of n such that 6n^2-5 is a square.
 * @author Sean A. Irvine
 */
public class A080806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080806() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 3, 7, 29});
  }
}
