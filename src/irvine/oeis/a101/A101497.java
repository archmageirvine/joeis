package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101497 Expansion of (1-x^2)/(1-2x+2x^3+x^4).
 * @author Sean A. Irvine
 */
public class A101497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101497() {
    super(new long[] {-1, -2, 0, 2}, new long[] {1, 2, 3, 4});
  }
}
