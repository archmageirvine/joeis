package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052927 Expansion of 1/(1-4*x-x^3).
 * @author Sean A. Irvine
 */
public class A052927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052927() {
    super(new long[] {1, 0, 4}, new long[] {1, 4, 16});
  }
}
