package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274503 a(n) = 301*binomial(n-1,8)+52*binomial(n-1,7)+binomial(n-1,6).
 * @author Sean A. Irvine
 */
public class A274503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274503() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 1, 59, 745, 4665, 19995, 67287, 191103});
  }
}
