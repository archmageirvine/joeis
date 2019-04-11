package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175772 Expansion of <code>1/(1 - x - x^9 - x^17 + x^18)</code>.
 * @author Sean A. Irvine
 */
public class A175772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175772() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11});
  }
}
