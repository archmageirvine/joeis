package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088060 Smallest Fibonacci number F(k) &gt; n-th Fibonacci number F(n) such that F(n) + F(k) is a square.
 * @author Georg Fischer
 */
public class A088060 extends FiniteSequence {

  /** Construct the sequence. */
  public A088060() {
    super(3, 3, 34, 13, 89, 14930352);
  }
}
