package irvine.oeis.a383;

import irvine.oeis.FilterSequence;

/**
 * A383244 Primes of the form p(k)*p(k+1)*(p(k+1) - p(k)) + 1 sorted by increasing k.
 * @author Sean A. Irvine
 */
public class A383244 extends FilterSequence {

  /** Construct the sequence. */
  public A383244() {
    super(1, new A383242(), PRIME);
  }
}

