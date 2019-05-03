package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087290 Number of pairs of polynomials <code>(f,g)</code> in <code>GF(3)[x]</code> satisfying <code>deg(f) &lt;=</code> n, <code>deg(g) &lt;= n</code> and <code>gcd(f,g) = 1</code>.
 * @author Sean A. Irvine
 */
public class A087290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087290() {
    super(new long[] {-9, 10}, new long[] {8, 56});
  }
}
