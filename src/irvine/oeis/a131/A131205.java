package irvine.oeis.a131;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000123;

/**
 * A131205 a(n) = a(n-1) + a(floor(n/2)) + a(ceiling(n/2)).
 * @author Georg Fischer
 */
public class A131205 extends PartialSumSequence {

  /** Construct the sequence. */
  public A131205() {
    super(1, new A000123());
  }
}
