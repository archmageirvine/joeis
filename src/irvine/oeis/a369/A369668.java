package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a358.A358774;

/**
 * A369668 Numbers that have an even number of prime factors with multiplicity and whose arithmetic derivative is of the form 4k+3.
 * @author Georg Fischer
 */
public class A369668 extends FilterSequence {

  /** Construct the sequence. */
  public A369668() {
    super(1, new A358774(), v -> (Functions.BIG_OMEGA.l(v) & 1) == 0);
  }
}
