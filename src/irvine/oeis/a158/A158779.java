package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158779 Expansion of (1+8*x+72*x^2+648*x^3)/(1-x-6561*x^4).
 * @author Sean A. Irvine
 */
public class A158779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158779() {
    super(new long[] {6561, 0, 0, 1}, new long[] {1, 9, 81, 729});
  }
}
