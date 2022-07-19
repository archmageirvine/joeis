package irvine.oeis.a058;

import irvine.oeis.MultiplicativeSequence;

/**
 * A058026 Number of positive integers, k, where k &lt;= n and gcd(k,n) = gcd(k+1,n) = 1.
 * @author Sean A. Irvine
 */
public class A058026 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A058026() {
    super(1, (p, e) -> p.pow(e - 1).multiply(p.subtract(2)));
  }
}
