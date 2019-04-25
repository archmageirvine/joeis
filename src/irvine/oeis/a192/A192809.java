package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192809 Coefficient of x in the reduction of the polynomial <code>(x^2 + 2)^n by x^3 -&gt; x^2 + 2</code>.
 * @author Sean A. Irvine
 */
public class A192809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192809() {
    super(new long[] {8, -12, 7}, new long[] {0, 0, 2});
  }
}
