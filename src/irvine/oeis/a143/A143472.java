package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143472 Expansion of 1/(1 - x^3 - x^5 - x^7 + x^10), inverse of a Salem polynomial.
 * @author Sean A. Irvine
 */
public class A143472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143472() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 1, 2, 1});
  }
}
