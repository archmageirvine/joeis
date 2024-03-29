package irvine.oeis.a187;
// Generated by gen_seq4.pl rankxf at 2023-07-30 22:10

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;
import irvine.oeis.transform.RankTransform;

/**
 * A187907 Rank transform of the sequence floor((4 - sqrt(5))*n); complement of A187908.
 * @author Georg Fischer
 */
public class A187907 extends RankTransform {

  /** Construct the sequence. */
  public A187907() {
    super(1, new LambdaSequence(1, n -> CR.valueOf(n).multiply(CR.FOUR.subtract(CR.FIVE.sqrt())).floor()));
  }
}
