package irvine.oeis.a076;
// Generated by gen_seq4.pl 2023-12-24/filter at 2023-12-26 12:51

import irvine.oeis.FilterSequence;
import irvine.oeis.a036.A036301;

/**
 * A076167 Primes p such that sum of even digits of p equals sum of odd digits of p.
 * @author Georg Fischer
 */
public class A076167 extends FilterSequence {

  /** Construct the sequence. */
  public A076167() {
    super(1, new A036301(), PRIME);
  }
}
