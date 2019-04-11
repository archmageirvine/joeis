package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225501 Expansion of <code>1/(1 - x^4 - x^5 - x^6 - x^7 - x^8 + x^12)</code>.
 * @author Sean A. Irvine
 */
public class A225501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225501() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 4});
  }
}
