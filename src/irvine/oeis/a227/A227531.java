package irvine.oeis.a227;

import irvine.oeis.FilterSequence;

/**
 * A227531 Primes that are round(3*(4/3)^k) for some k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A227531 extends FilterSequence {

  /** Construct the sequence. */
  public A227531() {
    super(1, new A227391(), PRIME);
  }
}
