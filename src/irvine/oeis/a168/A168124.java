package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168124 a(n) = n^2*(n^6+1)/2.
 * @author Sean A. Irvine
 */
public class A168124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168124() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 130, 3285, 32776, 195325, 839826, 2882425, 8388640});
  }
}
