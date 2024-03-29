package irvine.oeis.a245;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A245105 a(n) = Sum_{k=0..n} binomial(n,k) * (2^k + 3^k)^(n-k) * 3^(k^2).
 * @author Georg Fischer
 */
public class A245105 extends LambdaSequence {

  /** Construct the sequence. */
  public A245105() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Z.ONE.shiftLeft(k).add(Z.THREE.pow(k)).pow(Z.valueOf(n - k))).multiply(Z.THREE.pow((long) k * k))));
  }
}
