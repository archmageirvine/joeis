package irvine.oeis.a127;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A127849 a(n) = 5^C(n,2)*(5^n-1)/4.
 * a(n)=5^binom(n,2)*(5^n-1)/4
 * @author Georg Fischer
 */
public class A127849 extends LambdaSequence {

  /** Construct the sequence. */
  public A127849() {
    super(0, n -> Z.FIVE.pow(Binomial.binomial(n, 2)).multiply(Z.FIVE.pow(n).subtract(Z.ONE)).divide(Z.FOUR));
  }
}
