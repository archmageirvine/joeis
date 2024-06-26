package irvine.oeis.a354;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A354018 Expansion of e.g.f. -log(1-x)/(1 + log(1-x) - log(1-x)^2).
 * a(n) = sum(k=0,n,k!*fibonacci(k)*abs(stirl(n,k,1)));
 * @author Georg Fischer
 */
public class A354018 extends LambdaSequence {

  /** Construct the sequence. */
  public A354018() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Functions.FIBONACCI.z(k)).multiply(Functions.STIRLING1.z(n, k).abs())));
  }
}
