package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228706 Expansion of (1 - 3*x + 5*x^2 - 3*x^3 + x^4)/((1-x)^4*(1+x^2)^2).
 * @author Sean A. Irvine
 */
public class A228706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228706() {
    super(new long[] {-1, 4, -8, 12, -14, 12, -8, 4}, new long[] {1, 1, 1, 5, 11, 14, 18, 30});
  }
}
