package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084392 For k not divisible by 10, let <code>f(k)</code> be the number obtained by moving the last digit of k to the front. Then <code>a(n)</code> is the smallest k <code>&gt; 0</code>, made of nonzero digits, such that for all <code>1 &lt;= i &lt;</code> n, <code>i+1</code> divides <code>f^i(k)</code>.
 * @author Georg Fischer
 */
public class A084392 extends FiniteSequence {

  /** Construct the sequence. */
  public A084392() {
    super(1, 2, 6, 21, 2145, 2145, 2685, 6225, 6885);
  }
}
