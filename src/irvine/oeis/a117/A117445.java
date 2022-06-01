package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117445 Periodic {0,-1,1,4,-1,4,-4,-4,1,1,-4,-4,4,-1,4,1,-1} (period 17).
 * @author Sean A. Irvine
 */
public class A117445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117445() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new long[] {0, -1, 1, 4, -1, 4, -4, -4, 1, 1, -4, -4, 4, -1, 4, 1});
  }
}
