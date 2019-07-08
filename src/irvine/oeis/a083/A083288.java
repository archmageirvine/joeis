package irvine.oeis.a083;

import irvine.oeis.FiniteSequence;

/**
 * A083288 Sigma unitary-sigma perfect numbers: numbers m which satisfy the following equation for some integer k: <code>sigma(usigma(m)) = k*m</code> where <code>usigma(m)</code> is sum of unitary divisors of m.
 * @author Georg Fischer
 */
public class A083288 extends FiniteSequence {

  /** Construct the sequence. */
  public A083288() {
    super(1, 2, 9, 15, 18, 21, 40, 42, 60, 104, 120, 288, 312, 756, 1023, 1170, 2160, 2520, 3024, 4092, 6048, 6552, 8184, 17850, 18720, 29127, 30690, 40768, 58254, 79794, 147312);
  }
}
