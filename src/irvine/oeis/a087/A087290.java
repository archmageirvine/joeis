package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087290 Number of pairs of polynomials (f,g) in GF(3)[x] satisfying deg(f) &lt;= n, deg(g) &lt;= n and gcd(f,g) = 1.
 * @author Sean A. Irvine
 */
public class A087290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087290() {
    super(new long[] {-9, 10}, new long[] {8, 56});
  }
}
