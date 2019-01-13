package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028104.
 * @author Sean A. Irvine
 */
public class A028104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028104() {
    super(new long[] {-3168, 2004, -409, 34}, new long[] {1, 34, 747, 13496});
  }
}
