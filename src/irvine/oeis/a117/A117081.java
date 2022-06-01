package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117081 a(n) = 36*n^2 - 810*n + 2753, producing the conjectured record number of 45 primes in a contiguous range of n for quadratic polynomials, i.e., abs(a(n)) is prime for 0 &lt;= n &lt; 44.
 * @author Sean A. Irvine
 */
public class A117081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117081() {
    super(new long[] {1, -3, 3}, new long[] {2753, 1979, 1277});
  }
}
