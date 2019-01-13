package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036682.
 * @author Sean A. Irvine
 */
public class A036682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036682() {
    super(new long[] {-1, -4, -2, 8, 5, -8, -2, 4}, new long[] {3, 10, 32, 84, 207, 478, 1060, 2272});
  }
}
