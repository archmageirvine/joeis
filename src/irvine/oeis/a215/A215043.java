package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215043 <code>a(n) = F(12*n)/(24*L(2*n)), n &gt;= 0</code>, with F = A000045 (Fibonacci) and L = A000032 (Lucas).
 * @author Sean A. Irvine
 */
public class A215043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215043() {
    super(new long[] {-1, 144, -2640, 6930, -2640, 144}, new long[] {0, 2, 276, 34561, 4261992, 524393210});
  }
}
