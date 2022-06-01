package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121458 Expansion of (1+x-2*x^2)/(1-21*x^2-7*x^3).
 * @author Sean A. Irvine
 */
public class A121458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121458() {
    super(new long[] {7, 21, 0}, new long[] {1, 1, 19});
  }
}
