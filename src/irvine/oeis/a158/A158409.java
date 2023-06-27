package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158409 a(n) = 900*n - 1.
 * @author Sean A. Irvine
 */
public class A158409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158409() {
    super(1, new long[] {-1, 2}, new long[] {899, 1799});
  }
}
