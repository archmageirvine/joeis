package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213499.
 * @author Sean A. Irvine
 */
public class A213499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213499() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 4, 17, 47, 96, 176, 286, 439});
  }
}
