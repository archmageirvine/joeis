package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088060 For each Fibonacci number F(m) = A000045(m), m &gt;= 1, look for the smallest Fibonacci number F(k) &gt; F(m) such that F(m) + F(k) is a square. If it exists, append F(k) to the sequence.
 * @author Georg Fischer
 */
public class A088060 extends FiniteSequence {

  /** Construct the sequence. */
  public A088060() {
    super(1, FINITE, 3, 3, 34, 13, 89, 14930352);
  }
}
