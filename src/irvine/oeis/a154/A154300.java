package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154300 Primes of the form <code>(1+2+..</code>.+m)/57 = A000217(m)/57.
 * @author Georg Fischer
 */
public class A154300 extends FiniteSequence {

  /** Construct the sequence. */
  public A154300() {
    super(3, 13, 29, 113);
  }
}
