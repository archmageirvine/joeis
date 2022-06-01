package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081499 Sum at 45 degrees to horizontal in triangle of A081498.
 * @author Sean A. Irvine
 */
public class A081499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081499() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 4, 6, 8, 11, 12});
  }
}
