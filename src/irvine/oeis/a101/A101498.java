package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101498 Expansion of (1-x^2)/(1-3x+x^2+3x^3+x^4).
 * @author Sean A. Irvine
 */
public class A101498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101498() {
    super(new long[] {-1, -3, -1, 3}, new long[] {1, 3, 7, 15});
  }
}
