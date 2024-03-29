package irvine.oeis.a280;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a286.A286935;

/**
 * A280953 Expansion of Product_{k&gt;=0} 1/(1 - x^(3*k*(k+1)+1)).
 * @author Sean A. Irvine
 */
public class A280953 extends PartialSumSequence {

  /** Construct the sequence. */
  public A280953() {
    super(new A286935());
  }
}
