package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124133 <code>a(n) = (-1/2)*Sum_{i1 + i2 + i3 = 2*n} ((2*n)!/(i1! i2! i3!))*B(i1)</code>, where B are the Bernoulli numbers (with <code>i1, i2, i3 &gt;= 1)</code>.
 * @author Sean A. Irvine
 */
public class A124133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124133() {
    super(new long[] {4, -9, 6}, new long[] {0, 5, 28});
  }
}
