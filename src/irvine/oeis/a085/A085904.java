package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085904 Numbers n such that <code>n, n+1</code> and <code>n+2</code> are highly composite numbers <code>(2),</code> i.e., all prime divisors <code>&lt;= 7</code> (A002473).
 * @author Georg Fischer
 */
public class A085904 extends FiniteSequence {

  /** Construct the sequence. */
  public A085904() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 14, 48);
  }
}
