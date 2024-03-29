package irvine.oeis.a186;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A186941 a(n)=2^C(n,2)*(2(4^n-n*2^n)-1).
 * a(n)=2^binom(n,2)*(2(4^n-n*2^n)-1)
 * @author Georg Fischer
 */
public class A186941 extends LambdaSequence {

  /** Construct the sequence. */
  public A186941() {
    super(0, n -> Z.TWO.pow(Binomial.binomial(n, 2)).multiply(Z.TWO.multiply(Z.FOUR.pow(n).subtract(Z.valueOf(n).multiply(Z.ONE.shiftLeft(n)))).subtract(Z.ONE)));
  }
}
