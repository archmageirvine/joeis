package irvine.oeis.a107;

import irvine.oeis.UnionSequence;

/**
 * A107697 Primes with digital product = 12.
 * @author Georg Fischer
 */
public class A107697 extends UnionSequence {

  /** Construct the sequence. */
  public A107697() {
    super(new A107689(2, 6), new A107689(3, 4), new A107689(2, 2, 3));
  }
}
