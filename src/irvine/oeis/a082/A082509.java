package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-05-25/filter at 2024-05-25 23:20

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001223;

/**
 * A082509 Differences between consecutive primes that are not powers of 2 in order of their appearance. Differences which are powers of 2 are omitted from A001223.
 * @author Georg Fischer
 */
public class A082509 extends FilterSequence {

  /** Construct the sequence. */
  public A082509() {
    super(1, new A001223(), (n, v) -> v.bitCount() != 1);
  }
}
