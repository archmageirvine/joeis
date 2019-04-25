package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087292 Number of pairs of polynomials (f,g) in <code>GF(3)[x]</code> satisfying <code>1 &lt;=</code> deg(f) <code>&lt; =n, 1 &lt;=</code> deg(g) <code>&lt;= n</code> and gcd(f,g) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A087292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087292() {
    super(new long[] {27, -39, 13}, new long[] {0, 24, 384});
  }
}
