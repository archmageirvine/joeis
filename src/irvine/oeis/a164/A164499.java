package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164499.
 * @author Sean A. Irvine
 */
public class A164499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164499() {
    super(new long[] {-1, 1, 0, 1, -3, 3}, new long[] {13, 21, 33, 51, 79, 122});
  }
}
