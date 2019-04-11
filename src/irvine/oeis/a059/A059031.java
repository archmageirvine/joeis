package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059031 Fifth main diagonal of A059026: <code>a(n) =</code> B(n+4,n) = lcm(n+4,n)/(n+4) + lcm(n+4,n)/n <code>- 1</code> for all <code>n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A059031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059031() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {5, 3, 9, 2, 13, 7, 17, 4});
  }
}
