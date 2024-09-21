package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085904 Numbers k such that k, k+1 and k+2 are 7-smooth, i.e., all prime divisors &lt;= 7 (A002473).
 * @author Georg Fischer
 */
public class A085904 extends FiniteSequence {

  /** Construct the sequence. */
  public A085904() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 14, 48);
  }
}
