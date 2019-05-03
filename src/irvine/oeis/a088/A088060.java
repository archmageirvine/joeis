package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088060 Smallest Fibonacci number <code>F(k) &gt; n-th</code> Fibonacci number <code>F(n)</code> such that <code>F(n) + F(k)</code> is a square.
 * @author Georg Fischer
 */
public class A088060 extends FiniteSequence {

  /** Construct the sequence. */
  public A088060() {
    super(3, 3, 34, 13, 89, 14930352);
  }
}
