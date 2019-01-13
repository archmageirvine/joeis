package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090596.
 * @author Sean A. Irvine
 */
public class A090596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090596() {
    super(new long[] {-8, -8, -2, -2, 5, 5, -1}, new long[] {1, 1, 2, 3, 7, 12, 24});
  }
}
