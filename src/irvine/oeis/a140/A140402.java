package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140402 Expansion of <code>x^4/((1-x)^2*(1-x^3)) + x^5/((1-x)*(1-x^2)*(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A140402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140402() {
    super(new long[] {1, 0, -1, -1, 0, 0, 0, 1, 1, 0}, new long[] {0, 0, 0, 0, 1, 3, 4, 7, 9, 12});
  }
}
