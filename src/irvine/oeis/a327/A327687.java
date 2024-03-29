package irvine.oeis.a327;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001175;

/**
 * A327687 Partial sums of Pisano periods (A001175).
 * @author Sean A. Irvine
 */
public class A327687 extends PartialSumSequence {

  /** Construct the sequence. */
  public A327687() {
    super(1, new A001175());
  }
}
