package irvine.oeis.a082;
// Generated by gen_seq4.pl robots/diffseq at 2023-09-04 09:14

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001223;

/**
 * A082510 Differences of consecutive primes being divisible by 6 in order of their appearance in A001223: terms not divisible by 6 are omitted from A001223.
 * @author Georg Fischer
 */
public class A082510 extends FilterSequence {

  /** Construct the sequence. */
  public A082510() {
    super(1, new A001223(), t -> t.mod(6) == 0);
  }
}
