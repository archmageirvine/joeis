package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087292 Number of pairs of polynomials (f,g) in GF(3)[x] satisfying 1 &lt;= deg(f) &lt; =n, 1 &lt;= deg(g) &lt;= n and gcd(f,g) = 1.
 * @author Sean A. Irvine
 */
public class A087292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087292() {
    super(new long[] {27, -39, 13}, new long[] {0, 24, 384});
  }
}
