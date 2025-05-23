package irvine.oeis.a383;

import irvine.oeis.FilterSequence;

/**
 * A383243 Primes of the form p(k)*p(k+1)*(p(k+1) - p(k)) - 1 sorted by increasing k.
 * @author Sean A. Irvine
 */
public class A383243 extends FilterSequence {

  /** Construct the sequence. */
  public A383243() {
    super(1, new A383241(), PRIME);
  }
}

