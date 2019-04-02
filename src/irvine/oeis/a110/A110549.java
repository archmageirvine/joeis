package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110549 Periodic {1,2,4,3,3,4,2,1}.
 * @author Sean A. Irvine
 */
public class A110549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110549() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {1, 2, 4, 3, 3, 4, 2});
  }
}
