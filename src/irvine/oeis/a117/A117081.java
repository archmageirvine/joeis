package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117081 <code>a(n) = 36*n^2 - 810*n + 2753</code>, producing the conjectured record number of 45 primes in a contiguous range of n for quadratic polynomials, i.e., <code>abs(a(n))</code> is prime for <code>0 &lt;= n &lt; 44</code>.
 * @author Sean A. Irvine
 */
public class A117081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117081() {
    super(new long[] {1, -3, 3}, new long[] {2753, 1979, 1277});
  }
}
