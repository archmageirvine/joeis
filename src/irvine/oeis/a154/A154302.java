package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154302 Primes of the form (1+2+...+m)/87 = A000217(m)/87.
 * @author Georg Fischer
 */
public class A154302 extends FiniteSequence {

  /** Construct the sequence. */
  public A154302() {
    super(1, FINITE, 5, 19, 43, 173);
  }
}
