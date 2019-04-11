package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143373 Expansion of <code>x / (1-x-2*x^3-2*x^5-x^7)</code>.
 * @author Sean A. Irvine
 */
public class A143373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143373() {
    super(new long[] {1, 0, 2, 0, 2, 0, 1}, new long[] {1, 1, 1, 3, 5, 9, 17});
  }
}
