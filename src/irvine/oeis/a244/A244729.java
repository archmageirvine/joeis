package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244729 10*n^3.
 * @author Sean A. Irvine
 */
public class A244729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244729() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 80, 270});
  }
}
