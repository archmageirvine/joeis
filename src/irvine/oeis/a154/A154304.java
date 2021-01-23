package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154304 Primes of the form (1+2+...+m)/210 = A000217(m)/210.
 * @author Georg Fischer
 */
public class A154304 extends FiniteSequence {

  /** Construct the sequence. */
  public A154304() {
    super(3, 17, 47, 419, 421);
  }
}
