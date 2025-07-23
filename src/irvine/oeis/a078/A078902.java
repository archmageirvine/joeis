package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078902 Generalized Fermat primes of the form (k+1)^2^m + k^2^m, with m&gt;1.
 * @author Sean A. Irvine
 */
public class A078902 extends FilterSequence {

  /** Construct the sequence. */
  public A078902() {
    super(1, new A078901(), PRIME);
  }
}
