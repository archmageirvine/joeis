package irvine.oeis.a068;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002858;

/**
 * A068820 Ulam numbers that are primes.
 * @author Sean A. Irvine
 */
public class A068820 extends FilterSequence {

  /** Construct the sequence. */
  public A068820() {
    super(1, new A002858(), PRIME);
  }
}
