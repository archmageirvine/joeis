package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098582 Expansion of <code>(1+2*x+4*x^2+8*x^3)/(1-x-16*x^5)</code>.
 * @author Sean A. Irvine
 */
public class A098582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098582() {
    super(new long[] {16, 0, 0, 0, 1}, new long[] {1, 3, 7, 15, 15});
  }
}
