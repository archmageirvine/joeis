package irvine.oeis.a177;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a054.A054595;

/**
 * A177451 Partial sums of A054595.
 * @author Sean A. Irvine
 */
public class A177451 extends PartialSumSequence {

  /** Construct the sequence. */
  public A177451() {
    super(3, new A054595());
  }
}
