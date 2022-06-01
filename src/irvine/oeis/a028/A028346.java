package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028346 Expansion of 1/((1-x)^4*(1-x^2)^2).
 * @author Sean A. Irvine
 */
public class A028346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028346() {
    super(new long[] {-1, 4, -4, -4, 10, -4, -4, 4}, new long[] {1, 4, 12, 28, 58, 108, 188, 308});
  }
}
