package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215044 a(n) = F(2*n)^5 with F=A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A215044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215044() {
    super(new long[] {-1, 144, -2640, 6930, -2640, 144}, new long[] {0, 1, 243, 32768, 4084101, 503284375});
  }
}
