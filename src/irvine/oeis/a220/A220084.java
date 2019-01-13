package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220084.
 * @author Sean A. Irvine
 */
public class A220084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220084() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 15, 62, 162});
  }
}
