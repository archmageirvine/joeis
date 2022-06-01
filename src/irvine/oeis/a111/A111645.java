package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111645 Expansion of (x+1)*(1-3*x)/((x^2+4*x+1)*(x^2-2*x-1)).
 * @author Sean A. Irvine
 */
public class A111645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111645() {
    super(new long[] {1, 2, -8, -6}, new long[] {-1, 8, -37, 156});
  }
}
