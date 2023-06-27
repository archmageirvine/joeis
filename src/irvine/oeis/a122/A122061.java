package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122061 First pentagonal number, 2nd hexagonal number, 3rd heptagonal number, 4th octagonal number and then repeat the same pattern: 5th pentagonal, 6th hexagonal, 7th heptagonal, 8th octagonal, etc.
 * @author Sean A. Irvine
 */
public class A122061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122061() {
    super(1, new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 6, 18, 40, 35, 66, 112, 176, 117, 190, 286, 408});
  }
}
