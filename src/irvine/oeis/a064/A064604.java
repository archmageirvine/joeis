package irvine.oeis.a064;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001159;

/**
 * A064604 Partial sums of A001159: Sum_{j=1..n} sigma_4(j).
 * @author Georg Fischer
 */
public class A064604 extends PartialSumSequence {

  /** Construct the sequence. */
  public A064604() {
    super(1, new A001159());
  }
}
