package irvine.oeis.a218;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001877;

/**
 * A218445 a(n) = Sum_{k&gt;=0} floor(n/(5*k + 2)).
 * @author Georg Fischer
 */
public class A218445 extends PartialSumSequence {

  /** Construct the sequence. */
  public A218445() {
    super(new A001877());
  }
}
