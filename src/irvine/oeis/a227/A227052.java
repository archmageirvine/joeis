package irvine.oeis.a227;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A227052 a(n) = (n^2)! / (n^2-n)! = number of ways of placing n labeled balls into n^2 labeled boxes with at most one ball in each box.
 * a(n)=(n^2)!/(n^2-n)!
 * @author Georg Fischer
 */
public class A227052 extends LambdaSequence {

  /** Construct the sequence. */
  public A227052() {
    super(0, n -> Functions.FACTORIAL.z(n * n).divide(Functions.FACTORIAL.z(n * n - n)));
  }
}
