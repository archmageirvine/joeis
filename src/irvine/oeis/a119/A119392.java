package irvine.oeis.a119;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A119392 a(n) = n!*Sum_{k=0..n} Stirling2(n,k)/k!.
 * a(n)=n!*sum(k=0, n, stirl2(n, k)/k!)
 * @author Georg Fischer
 */
public class A119392 extends LambdaSequence {

  /** Construct the sequence. */
  public A119392() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.STIRLING2.z(n, k), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
