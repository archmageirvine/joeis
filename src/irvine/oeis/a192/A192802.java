package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192802 Coefficient of x in the reduction of the polynomial <code>(x+2)^n</code> by <code>x^3-&gt;x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A192802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192802() {
    super(new long[] {11, -15, 7}, new long[] {0, 1, 4});
  }
}
