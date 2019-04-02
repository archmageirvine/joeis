package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275778 Tribonacci-like sequence a(n) = a(n-1) + a(n-2) + a(n-3) for n &gt;= 3, with a(0) = 1, a(1) = 2, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A275778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275778() {
    super(new long[] {1, 1, 1}, new long[] {1, 2, 1});
  }
}
