package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084392 For k not divisible by 10, let f(k) be the number obtained by moving the last digit of k to the front. Then a(n) is the smallest k &gt; 0, made of nonzero digits, such that for all 1 &lt;= i &lt; n, i+1 divides f^i(k).
 * @author Georg Fischer
 */
public class A084392 extends FiniteSequence {

  /** Construct the sequence. */
  public A084392() {
    super(1, FINITE, 1, 2, 6, 21, 2145, 2145, 2685, 6225, 6885);
  }
}
