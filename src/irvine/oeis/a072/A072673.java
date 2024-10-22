package irvine.oeis.a072;

import irvine.oeis.FilterSequence;

/**
 * A072673 Primes of form prime(n)*prime(2*n)+prime(n)+prime(2*n).
 * @author Sean A. Irvine
 */
public class A072673 extends FilterSequence {

  /** Construct the sequence. */
  public A072673() {
    super(new A072672(), PRIME);
  }
}
