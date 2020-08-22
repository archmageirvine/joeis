package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192810 Coefficient of x^2 in the reduction of the polynomial (x^2 + 2)^n by x^3 -&gt; x^2 + 2.
 * @author Sean A. Irvine
 */
public class A192810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192810() {
    super(new long[] {8, -12, 7}, new long[] {0, 1, 5});
  }
}
