package irvine.oeis.a329;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a067.A067824;

/**
 * A329110 Number of integer sequences 1 &lt;= b_1 &lt; b_2 &lt; ... &lt; b_t &lt;= n such that b_i divides b_(i+1) for all 0 &lt; i &lt; t.
 * @author Sean A. Irvine
 */
public class A329110 extends PartialSumSequence {

  /** Construct the sequence. */
  public A329110() {
    super(1, new A067824());
  }
}
