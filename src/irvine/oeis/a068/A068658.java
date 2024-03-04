package irvine.oeis.a068;

import irvine.oeis.FilterSequence;

/**
 * A068658 Primes in A068657.
 * @author Sean A. Irvine
 */
public class A068658 extends FilterSequence {

  /** Construct the sequence. */
  public A068658() {
    super(1, new A068657(), PRIME);
  }
}
