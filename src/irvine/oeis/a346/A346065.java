package irvine.oeis.a346;
// Generated by gen_seq4.pl partsum at 2021-09-29 10:45

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002295;

/**
 * A346065 a(n) = Sum_{k=0..n} binomial(6*k,k) / (5*k + 1).
 * @author Georg Fischer
 */
public class A346065 extends PartialSumSequence {

  /** Construct the sequence. */
  public A346065() {
    super(new A002295());
  }
}
