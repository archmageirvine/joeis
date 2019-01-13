package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244309.
 * @author Sean A. Irvine
 */
public class A244309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244309() {
    super(new long[] {-1, -1, 14, -4, -22, 2, 5}, new long[] {0, 0, 0, 4, 18, 100, 448});
  }
}
