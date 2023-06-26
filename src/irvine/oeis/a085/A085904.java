package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085904 Numbers n such that n, n+1 and n+2 are highly composite numbers (2), i.e., all prime divisors &lt;= 7 (A002473).
 * @author Georg Fischer
 */
public class A085904 extends FiniteSequence {

  /** Construct the sequence. */
  public A085904() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 14, 48);
  }
}
