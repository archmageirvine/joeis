package irvine.oeis.a279;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004233;

/**
 * A279539 Sum of ceilings of natural logs of first n integers.
 * @author Sean A. Irvine
 */
public class A279539 extends PartialSumSequence {

  /** Construct the sequence. */
  public A279539() {
    super(1, new A004233());
  }
}
