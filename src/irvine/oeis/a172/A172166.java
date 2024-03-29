package irvine.oeis.a172;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a028.A028388;

/**
 * A172166 Partial sums of A028388 good primes (version 2).
 * @author Sean A. Irvine
 */
public class A172166 extends PartialSumSequence {

  /** Construct the sequence. */
  public A172166() {
    super(1, new A028388());
  }
}
