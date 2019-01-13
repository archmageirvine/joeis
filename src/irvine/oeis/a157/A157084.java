package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157084.
 * @author Sean A. Irvine
 */
public class A157084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157084() {
    super(new long[] {1, -11, 11}, new long[] {0, 10, 108});
  }
}
