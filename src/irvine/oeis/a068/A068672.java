package irvine.oeis.a068;

import irvine.oeis.FilterSequence;

/**
 * A068672 Primes in A068671.
 * @author Sean A. Irvine
 */
public class A068672 extends FilterSequence {

  /** Construct the sequence. */
  public A068672() {
    super(1, new A068671(), PRIME);
  }
}
