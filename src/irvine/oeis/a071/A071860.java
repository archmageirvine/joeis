package irvine.oeis.a071;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a053.A053866;

/**
 * A071860 Number of k 1&lt;=k&lt;=n such that sigma(k) is odd.
 * @author Sean A. Irvine
 */
public class A071860 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071860() {
    super(1, new A053866());
  }
}
