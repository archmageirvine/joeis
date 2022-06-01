package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217574 (n^2)*(n^2-1)*(n^2-2)*(n^2-3).
 * @author Sean A. Irvine
 */
public class A217574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217574() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 24, 3024, 43680, 303600, 1413720, 5085024, 15249024});
  }
}
