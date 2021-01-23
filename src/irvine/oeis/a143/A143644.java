package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143644 Expansion of 1/(1 - x^3 - x^4 + x^7 - x^10 - x^11 + x^14) (a Salem polynomial).
 * @author Sean A. Irvine
 */
public class A143644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143644() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0, -1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 2, 2, 2, 3});
  }
}
