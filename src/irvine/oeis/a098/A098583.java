package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098583 Expansion of <code>(1+2*x+4*x^2+8*x^3+16*x^4)/(1-x-32*x^6)</code>.
 * @author Sean A. Irvine
 */
public class A098583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098583() {
    super(new long[] {32, 0, 0, 0, 0, 1}, new long[] {1, 3, 7, 15, 31, 31});
  }
}
