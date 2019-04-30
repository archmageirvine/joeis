package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154297 Primes of the form <code>(1+2+3+</code>...+m)/21 = A000217(m)/21, for some m.
 * @author Georg Fischer
 */
public class A154297 extends FiniteSequence {

  /** Construct the sequence. */
  public A154297() {
    super(5, 11, 41, 43);
  }
}
