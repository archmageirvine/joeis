package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089499.
 * @author Sean A. Irvine
 */
public class A089499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089499() {
    super(new long[] {-1, 0, 6, 0}, new long[] {0, 1, 4, 5});
  }
}
