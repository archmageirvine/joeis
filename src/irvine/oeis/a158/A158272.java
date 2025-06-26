package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158272 a(n) = 324*n + 1.
 * @author Sean A. Irvine
 */
public class A158272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158272() {
    super(1, new long[] {-1, 2}, new long[] {325, 649});
  }
}
