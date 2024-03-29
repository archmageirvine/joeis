package irvine.oeis.a134;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A134095 Expansion of e.g.f. A(x) = 1/(1 - LambertW(-x)^2).
 * @author Georg Fischer
 */
public class A134095 extends LambdaSequence {

  /** Construct the sequence. */
  public A134095() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(n - k).pow(k).multiply(Z.valueOf(k).pow(n - k)).multiply(Binomial.binomial(n, k))));
  }
}
