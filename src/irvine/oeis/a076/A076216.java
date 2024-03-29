package irvine.oeis.a076;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a006.A006466;

/**
 * A076216 Partial sum of coefficients in the continued fraction expansion of sum(k&gt;=0,1/2^(2^k-1)).
 * @author Sean A. Irvine
 */
public class A076216 extends PartialSumSequence {

  /** Construct the sequence. */
  public A076216() {
    super(1, new A006466());
  }
}
