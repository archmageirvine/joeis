package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110660 Oblong (promic) numbers repeated.
 * @author Sean A. Irvine
 */
public class A110660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110660() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 2, 2, 6});
  }
}
