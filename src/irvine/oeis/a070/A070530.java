package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070530 Primes of form Cyclotomic[n,2^n].
 * @author Sean A. Irvine
 */
public class A070530 extends FilterSequence {

  /** Construct the sequence. */
  public A070530() {
    super(1, new A070526(), PRIME);
  }
}
