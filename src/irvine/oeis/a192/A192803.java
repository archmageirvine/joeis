package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192803 Coefficient of <code>x^2</code> in the reduction of the polynomial <code>(x+2)^n</code> by <code>x^3-&gt;x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A192803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192803() {
    super(new long[] {11, -15, 7}, new long[] {0, 0, 1});
  }
}
