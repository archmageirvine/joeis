package irvine.oeis.a157;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A157449 Difference between n and the sum of its divisors except 1 and itself.
 * a(n)=2*n+1-sigma(n, 1)
 * @author Georg Fischer
 */
public class A157449 extends LambdaSequence {

  /** Construct the sequence. */
  public A157449() {
    super(2, n -> Z.TWO.multiply(n).add(Z.ONE).subtract(Jaguar.factor(n).sigma(1)));
  }
}
