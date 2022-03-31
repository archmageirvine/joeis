package irvine.oeis.a107;

import irvine.oeis.UnionSequence;

/**
 * A107692 Primes whose product of digits is 6.
 * @author Georg Fischer
 */
public class A107692 extends UnionSequence {

  /** Construct the sequence. */
  public A107692() {
    super(new A107689(6), new A107689(2, 3));
  }
}
