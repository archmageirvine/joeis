package irvine.oeis.a085;
// Generated by gen_seq4.pl 2023-09-25/lambda at 2023-09-28 18:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A085058 a(n) = A001511(n+1) + 1.
 * @author Georg Fischer
 */
public class A085058 extends LambdaSequence {

  /** Construct the sequence. */
  public A085058() {
    super(0, n -> Functions.VALUATION.z(Z.FIVE.pow(n + 1).subtract(1), Z.TWO));
  }
}
