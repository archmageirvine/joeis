package irvine.oeis.a051;

import irvine.oeis.PrimeSubsequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a020.A020549;

/**
 * A051739 Primes of the form (n!)^2 + 1.
 * @author Sean A. Irvine
 */
public class A051739 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A051739() {
    super(new SkipSequence(new A020549(), 1));
  }
}
