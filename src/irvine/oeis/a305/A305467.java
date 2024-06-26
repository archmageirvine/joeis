package irvine.oeis.a305;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A305467 a(n) = Sum_{k=0..floor(n/2)} ((n-k)!/k!)*binomial(n-k,k)*n^(n-2*k)*(-1)^k.
 * a(n) = sum(k=0,n/2,((n-k)!/k!)*binom(n-k,k)*n^(n-2*k)*(-1)^k)
 * @author Georg Fischer
 */
public class A305467 extends LambdaSequence {

  /** Construct the sequence. */
  public A305467() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Functions.FACTORIAL.z(n - k).divide(Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(n - k, k)).multiply(Z.valueOf(n).pow(n - 2L * k)).multiply(Z.NEG_ONE.pow(k))));
  }
}
