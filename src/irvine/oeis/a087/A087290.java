package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087290 Number of pairs of polynomials (f,g) in <code>GF(3)[x]</code> satisfying deg(f) <code>&lt;= n,</code> deg(g) <code>&lt;= n</code> and gcd(f,g) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A087290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087290() {
    super(new long[] {-9, 10}, new long[] {8, 56});
  }
}
