package irvine.oeis.a066;

import irvine.oeis.FilterSequence;

/**
 * A066681 Badly sieved numbers (A066680) which are not primes.
 * @author Sean A. Irvine
 */
public class A066681 extends FilterSequence {

  /** Construct the sequence. */
  public A066681() {
    super(1, new A066680(), k -> !k.isProbablePrime());
  }
}
