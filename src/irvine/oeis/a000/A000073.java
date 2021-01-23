package irvine.oeis.a000;

import irvine.oeis.LinearRecurrence;

/**
 * A000073 Tribonacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) for n &gt;= 3 with a(0) = a(1) = 0 and a(2) = 1.
 * @author Sean A. Irvine
 */
public class A000073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000073() {
    super(new long[] {1, 1, 1}, new long[] {0, 0, 1});
  }
}

