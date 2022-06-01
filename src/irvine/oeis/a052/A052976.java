package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052976 Expansion of (1-2x)/(1-3x-x^3+2x^4).
 * @author Sean A. Irvine
 */
public class A052976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052976() {
    super(new long[] {-2, 1, 0, 3}, new long[] {1, 1, 3, 10});
  }
}
