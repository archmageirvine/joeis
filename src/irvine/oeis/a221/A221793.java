package irvine.oeis.a221;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002407;

/**
 * A221793 Partial sums of cuban primes A002407, that is, primes equal to the difference of two consecutive cubes.
 * @author Sean A. Irvine
 */
public class A221793 extends PartialSumSequence {

  /** Construct the sequence. */
  public A221793() {
    super(1, new A002407());
  }
}
