package irvine.oeis.a268;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A268363 Number of n X 2 arrays containing 2 copies of 0..n-1 with row sums equal.
 * a(n)=2^floor(n/2)*n!
 * @author Georg Fischer
 */
public class A268363 extends LambdaSequence {

  /** Construct the sequence. */
  public A268363() {
    super(0, n -> Z.ONE.shiftLeft(n / 2).multiply(Functions.FACTORIAL.z(n)));
  }
}
