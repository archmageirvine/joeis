package irvine.oeis.a339;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A339150 a(n) = Sum_{k=1..n} floor(k/2)! * floor((n - k)/2)! binomial((n-floor(k/2)-1), n-k).
 * @author Georg Fischer
 */
public class A339150 extends LambdaSequence {

  /** Construct the sequence. */
  public A339150() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.FACTORIAL.z(k / 2).multiply(Functions.FACTORIAL.z(Z.valueOf(n - k).divide(Z.TWO))).multiply(Binomial.binomial(n - k / 2 - 1, n - k))));
  }
}
