package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127989 a(n) = 2*n^3 - 2*n + 9.
 * @author Sean A. Irvine
 */
public class A127989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127989() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 21, 57, 129});
  }
}
