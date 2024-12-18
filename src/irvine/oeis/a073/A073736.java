package irvine.oeis.a073;

import irvine.oeis.PartialSumSequence;

/**
 * A073736 Sum of primes whose index is congruent to n (mod 3); equals the partial sums of A073737 (in which sums of three successive terms form the primes).
 * @author Sean A. Irvine
 */
public class A073736 extends PartialSumSequence {

  /** Construct the sequence. */
  public A073736() {
    super(1, new A073737());
  }
}
