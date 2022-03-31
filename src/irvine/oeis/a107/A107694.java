package irvine.oeis.a107;

import irvine.oeis.UnionSequence;

/**
 * A107694 Primes with digital product = 8.
 * @author Georg Fischer
 */
public class A107694 extends UnionSequence {

  /** Construct the sequence. */
  public A107694() {
    super(new A107689(8), new A107689(2, 4), new A107689(2, 2, 2));
  }
}
