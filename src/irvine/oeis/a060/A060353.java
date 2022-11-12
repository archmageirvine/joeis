package irvine.oeis.a060;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A060353 Primes of the form n*3^n - 1.
 * @author Sean A. Irvine
 */
public class A060353 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A060353() {
    super(new A060352());
  }
}
