package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081499.
 * @author Sean A. Irvine
 */
public class A081499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081499() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 4, 6, 8, 11, 12});
  }
}
