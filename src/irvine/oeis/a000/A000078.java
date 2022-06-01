package irvine.oeis.a000;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A000078 Tetranacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) for n &gt;= 4 with a(0) = a(1) = a(2) = 0 and a(3) = 1.
 * @author Sean A. Irvine
 */
public class A000078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000078() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 0, 0, 1});
  }
}
