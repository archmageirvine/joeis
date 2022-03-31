package irvine.oeis.a107;

import irvine.oeis.UnionSequence;

/**
 * A107690 Primes with digital product = 4.
 * @author Georg Fischer
 */
public class A107690 extends UnionSequence {

  /** Construct the sequence. */
  public A107690() {
    super(new A107689(4), new A107689(2, 2));
  }
}
