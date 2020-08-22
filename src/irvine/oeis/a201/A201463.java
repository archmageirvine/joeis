package irvine.oeis.a201;

import irvine.oeis.FiniteSequence;

/**
 * A201463 A list of 25 distinct numbers with property that the sum of their reciprocals is 1 and each number is of the form p^i*q^j where p and q are distinct primes.
 * @author Georg Fischer
 */
public class A201463 extends FiniteSequence {

  /** Construct the sequence. */
  public A201463() {
    super(6, 10, 12, 14, 15, 18, 21, 22, 24, 26, 28, 33, 35, 36, 39, 48, 52, 56, 65, 72, 88, 91, 99, 117, 144);
  }
}
