package irvine.oeis.a074;
// Generated by gen_seq4.pl robot/partsum at 2023-09-18 22:05

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a076.A076821;

/**
 * A074741 Sum of squares of gaps between consecutive primes.
 * @author Georg Fischer
 */
public class A074741 extends PartialSumSequence {

  /** Construct the sequence. */
  public A074741() {
    super(1, new A076821());
  }
}
