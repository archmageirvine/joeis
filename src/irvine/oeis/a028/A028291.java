package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028291 Expansion of 1/((1-x)^2(1-x^2)(1-x^3)(1-x^5)) in powers of x.
 * @author Sean A. Irvine
 */
public class A028291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028291() {
    super(new long[] {1, -2, 0, 1, 1, -1, 0, 1, -1, -1, 0, 2}, new long[] {1, 2, 4, 7, 11, 17, 25, 35, 48, 64, 84, 108});
  }
}
