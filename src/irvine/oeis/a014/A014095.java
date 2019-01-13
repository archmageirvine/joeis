package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014095.
 * @author Sean A. Irvine
 */
public class A014095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014095() {
    super(new long[] {-1, 4, -2, -12, 17, 8, -28, 8, 17, -12, -2, 4}, new long[] {1, 1, 15, 29, 135, 310, 870, 1830, 3993, 7535, 14157, 24427});
  }
}
