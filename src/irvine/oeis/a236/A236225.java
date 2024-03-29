package irvine.oeis.a236;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a138.A138032;

/**
 * A236225 Sum of the seventeenth powers of the first n primes.
 * @author Sean A. Irvine
 */
public class A236225 extends PartialSumSequence {

  /** Construct the sequence. */
  public A236225() {
    super(1, new A138032());
  }
}
