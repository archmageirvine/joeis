package irvine.oeis.a354;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A354232 Expansion of e.g.f. exp(log(1 + x)^5).
 * a(n) = sum(k=0,n\5,(5*k)!*stirl(n,5*k,1)/k!);
 * @author Georg Fischer
 */
public class A354232 extends LambdaSequence {

  /** Construct the sequence. */
  public A354232() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 5, k -> Functions.FACTORIAL.z(5 * k).multiply(Functions.STIRLING1.z(n, 5L * k)).divide(Functions.FACTORIAL.z(k))));
  }
}
