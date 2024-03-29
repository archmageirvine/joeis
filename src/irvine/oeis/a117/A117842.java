package irvine.oeis.a117;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007918;

/**
 * A117842 Partial sum of smallest prime &gt;= n (A007918).
 * @author Sean A. Irvine
 */
public class A117842 extends PartialSumSequence {

  /** Construct the sequence. */
  public A117842() {
    super(new A007918());
  }
}
