package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-05-24.ack/filter at 2025-05-24 23:04

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A376503 Primes p such that p + 2, p + 4 and p + 6 are products  of 3, 5 and 7 primes respectively (counted with multiplicity).
 * @author Georg Fischer
 */
public class A376503 extends FilterSequence {

  /** Construct the sequence. */
  public A376503() {
    super(1, new A000040().skip(1), p -> Functions.BIG_OMEGA.i(p.add(2)) == 3 && Functions.BIG_OMEGA.i(p.add(4)) == 5 && Functions.BIG_OMEGA.i(p.add(6)) == 7);
  }
}
