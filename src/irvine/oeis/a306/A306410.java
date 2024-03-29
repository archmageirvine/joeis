package irvine.oeis.a306;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A306410 G.f.: Sum_{n&gt;=0} 2^n * x^n * (3^n + 2^n)^n / (2^n + 3^n*x)^(n+1)  =  Sum_{n&gt;=0} a(n) * x^n / 2^(n^2).
 * @author Georg Fischer
 */
public class A306410 extends LambdaSequence {

  /** Construct the sequence. */
  public A306410() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Z.THREE.pow(k).add(Z.ONE.shiftLeft(k)).pow(k)).multiply(Z.ZERO.subtract(Z.ONE.shiftLeft(n).multiply(Z.THREE.pow(k))).pow(Z.valueOf(n - k)))));
  }
}
