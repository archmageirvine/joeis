package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165803 Integers n such that the trajectory of n under repeated applications of the map <code>k-&gt;(k-3)/2</code> is a chain of primes that reaches 2 or <code>3 (n</code> itself need not be a prime).
 * @author Georg Fischer
 */
public class A165803 extends FiniteSequence {

  /** Construct the sequence. */
  public A165803() {
    super(2, 3, 7, 9, 17, 37, 77);
  }
}
