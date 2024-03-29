package irvine.oeis.a187;
// Generated by gen_seq4.pl rankxf at 2023-07-30 22:10

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;
import irvine.oeis.transform.RankTransform;

/**
 * A187578 Rank transform of the sequence 3*floor(n/3); complement of A187579.
 * @author Georg Fischer
 */
public class A187578 extends RankTransform {

  /** Construct the sequence. */
  public A187578() {
    super(1, new LambdaSequence(1, n -> CR.valueOf(n).divide(CR.THREE).floor().multiply(3)));
  }
}
