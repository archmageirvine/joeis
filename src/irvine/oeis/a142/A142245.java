package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142245 Expansion of <code>2*x*(6 + 5*x) / ((1 - x)*(1 - x - x^2))</code>.
 * @author Sean A. Irvine
 */
public class A142245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142245() {
    super(new long[] {-1, 0, 2}, new long[] {0, 12, 34});
  }
}
