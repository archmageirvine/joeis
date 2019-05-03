package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192810 Coefficient of <code>x^2</code> in the reduction of the polynomial <code>(x^2 + 2)^n</code> by <code>x^3 -&gt; x^2 + 2</code>.
 * @author Sean A. Irvine
 */
public class A192810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192810() {
    super(new long[] {8, -12, 7}, new long[] {0, 1, 5});
  }
}
