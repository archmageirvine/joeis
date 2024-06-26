package irvine.oeis.a179;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A179437 a(n) = |2n - prime(n)|.
 * a(n)=abs(2*n-prime(n))
 * @author Georg Fischer
 */
public class A179437 extends LambdaSequence {

  /** Construct the sequence. */
  public A179437() {
    super(1, n -> Z.TWO.multiply(n).subtract(Functions.PRIME.z(n)).abs());
  }
}
