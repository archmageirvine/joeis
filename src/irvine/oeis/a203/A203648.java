package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203648 <code>a(n) = (1/4) *</code> period of repeating sequence <code>{S(j) mod 2n}</code>, where <code>S(j)</code> is the sum of the first j squares.
 * @author Sean A. Irvine
 */
public class A203648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203648() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 9, 4, 5, 18});
  }
}
