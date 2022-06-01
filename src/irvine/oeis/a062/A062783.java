package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062783 a(n) = 3*n*(4*n-1).
 * @author Sean A. Irvine
 */
public class A062783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062783() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 42});
  }
}
