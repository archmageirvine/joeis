package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111734 Expansion of (1-x)*(2*x^2+2*x+1)/((x^2-x-1)*(x^2+x+1)).
 * @author Sean A. Irvine
 */
public class A111734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111734() {
    super(new long[] {1, 0, -1, -2}, new long[] {-1, 1, -1, 3});
  }
}
