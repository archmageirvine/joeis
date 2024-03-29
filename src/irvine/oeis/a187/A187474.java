package irvine.oeis.a187;
// Generated by gen_seq4.pl rankxf at 2023-07-30 22:10

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;
import irvine.oeis.transform.RankTransform;

/**
 * A187474 Rank transform of the sequence floor(n*(Pi-2)); complement of A187475.
 * @author Georg Fischer
 */
public class A187474 extends RankTransform {

  /** Construct the sequence. */
  public A187474() {
    super(1, new LambdaSequence(1, n -> CR.valueOf(n).multiply(CR.PI.subtract(CR.TWO)).floor()));
  }
}
