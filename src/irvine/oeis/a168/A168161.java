package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168161 Primes p which are equal to the sum of the binary digits in all primes &lt;= p.
 * @author Georg Fischer
 */
public class A168161 extends FiniteSequence {

  /** Construct the sequence. */
  public A168161() {
    super(3, 5, 11, 19, 23, 47, 61);
  }
}
