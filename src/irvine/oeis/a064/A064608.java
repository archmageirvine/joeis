package irvine.oeis.a064;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a034.A034444;

/**
 * A064608 Partial sums of A034444: sum of number of unitary divisors from 1 to n.
 * @author Georg Fischer
 */
public class A064608 extends PartialSumSequence {

  /** Construct the sequence. */
  public A064608() {
    super(new A034444());
  }
}
