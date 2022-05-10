package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180483 Expansion of (3+3*x-25*x^2-3*x^3+2*x^4)/((1-x)*(1-10*x^2+x^4)).
 * @author Sean A. Irvine
 */
public class A180483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180483() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {3, 6, 11, 38, 87});
  }
}
