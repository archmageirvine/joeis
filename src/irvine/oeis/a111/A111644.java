package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111644 Expansion of -(1+x^2)/((x^2+4*x+1)*(x^2-2*x-1)).
 * @author Sean A. Irvine
 */
public class A111644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111644() {
    super(new long[] {1, 2, -8, -6}, new long[] {1, -6, 29, -124});
  }
}
