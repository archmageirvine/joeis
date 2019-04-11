package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054000 <code>a(n) = 2*n^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A054000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054000() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 16});
  }
}
