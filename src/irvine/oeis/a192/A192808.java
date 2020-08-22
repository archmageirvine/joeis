package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192808 Constant term in the reduction of the polynomial (x^2 + 2)^n by x^3 -&gt; x^2 + 2.  See Comments.
 * @author Sean A. Irvine
 */
public class A192808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192808() {
    super(new long[] {8, -12, 7}, new long[] {1, 2, 6});
  }
}
