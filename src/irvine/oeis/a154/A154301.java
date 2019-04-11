package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154301 Primes of the form <code>(1+2+</code>...+m)/75 = A000217(m)/75.
 * @author Georg Fischer
 */
public class A154301 extends FiniteSequence {

  /** Construct the sequence. */
  public A154301() {
    super(17, 37, 149, 151);
  }
}
