package irvine.oeis.a081;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A081046 Difference of the first two Stirling numbers of the first kind.
 * @author Georg Fischer
 */
public class A081046 extends LambdaSequence {

  /** Construct the sequence. */
  public A081046() {
    super(0, n -> Functions.STIRLING1.z(n + 1, 1).subtract(Functions.STIRLING1.z(n + 1, 2)));
  }
}
