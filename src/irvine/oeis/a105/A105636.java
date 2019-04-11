package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105636 Transform of <code>n^3</code> by the Riordan array <code>(1/(1-x^2), x)</code>.
 * @author Sean A. Irvine
 */
public class A105636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105636() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 1, 8, 28, 72, 153});
  }
}
