package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235499.
 * @author Sean A. Irvine
 */
public class A235499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235499() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 9, 10});
  }
}
