package irvine.oeis.a280;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005063;

/**
 * A280385 a(n) = Sum_{k=1..n} prime(k)^2*floor(n/prime(k)) .
 * @author Georg Fischer
 */
public class A280385 extends PartialSumSequence {

  /** Construct the sequence. */
  public A280385() {
    super(new A005063());
  }
}
