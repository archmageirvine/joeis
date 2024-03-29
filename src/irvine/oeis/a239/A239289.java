package irvine.oeis.a239;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a014.A014612;

/**
 * A239289 Numbers that are not the product of three (not necessarily distinct) primes.
 * @author Georg Fischer
 */
public class A239289 extends ComplementSequence {

  /** Construct the sequence. */
  public A239289() {
    super(new A014612());
    next();
  }
}
