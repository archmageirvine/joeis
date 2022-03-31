package irvine.oeis.a107;

import irvine.oeis.UnionSequence;

/**
 * A107695 Primes with digital product = 9.
 * @author Georg Fischer
 */
public class A107695 extends UnionSequence {

  /** Construct the sequence. */
  public A107695() {
    super(new A107689(9), new A107689(3, 3));
  }
}
