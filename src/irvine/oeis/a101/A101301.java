package irvine.oeis.a101;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a006.A006093;

/**
 * A101301 The sum of the first n primes, minus n.
 * @author Georg Fischer
 */
public class A101301 extends PartialSumSequence {

  /** Construct the sequence. */
  public A101301() {
    super(1, new A006093());
  }
}
