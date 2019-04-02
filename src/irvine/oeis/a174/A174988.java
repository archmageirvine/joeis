package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174988 Expansion of -x*(x-1)*(3*x+1) / (9*x^4-8*x^2+1).
 * @author Sean A. Irvine
 */
public class A174988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174988() {
    super(new long[] {-9, 0, 8, 0}, new long[] {0, 1, 2, 5});
  }
}
