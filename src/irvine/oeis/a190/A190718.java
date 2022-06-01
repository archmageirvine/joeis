package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190718 Quadruplicated tetrahedral numbers A000292.
 * @author Sean A. Irvine
 */
public class A190718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190718() {
    super(new long[] {-1, 1, 0, 0, 3, -3, 0, 0, -3, 3, 0, 0, 1}, new long[] {1, 1, 1, 1, 4, 4, 4, 4, 10, 10, 10, 10, 20});
  }
}
