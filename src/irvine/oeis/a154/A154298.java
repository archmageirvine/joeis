package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154298 Primes of the form <code>(1+</code>...+m)/33 = A000217(m)/33, for some m.
 * @author Georg Fischer
 */
public class A154298 extends FiniteSequence {

  /** Construct the sequence. */
  public A154298() {
    super(2, 7, 17, 67);
  }
}
