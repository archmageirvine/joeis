package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105842 Numbers n such that 31*n^2 + 31*n + 1 is a square.
 * @author Sean A. Irvine
 */
public class A105842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105842() {
    super(1, new long[] {1, -1, 0, 0, -9241598, 9241598, 0, 0, 1}, new long[] {0, 55, 9064, 1480479, 3140319, 512899624, 83770465015L, 13681996386240L, 29021570410560L});
  }
}
