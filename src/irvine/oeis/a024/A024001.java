package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024001 a(n) = 1-n^3.
 * @author Sean A. Irvine
 */
public class A024001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024001() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 0, -7, -26});
  }
}
