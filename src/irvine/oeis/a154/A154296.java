package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154296 Primes of the form <code>(1+2+3+</code>...+m)/15 = A000217(m)/15, for some m.
 * @author Georg Fischer
 */
public class A154296 extends FiniteSequence {

  /** Construct the sequence. */
  public A154296() {
    super(3, 7, 29, 31);
  }
}
