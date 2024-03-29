package irvine.oeis.a213;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a023.A023896;

/**
 * A213544 Sum of numerators of Farey Sequence of order n.
 * @author Sean A. Irvine
 */
public class A213544 extends PartialSumSequence {

  /** Construct the sequence. */
  public A213544() {
    super(1, new A023896());
  }
}
