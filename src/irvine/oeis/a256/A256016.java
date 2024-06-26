package irvine.oeis.a256;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A256016 a(n) = n! * Sum_{k=0..n} k^n/k!.
 * a(n)=n!*sum(k=0, n, k^n/k!)
 * @author Georg Fischer
 */
public class A256016 extends LambdaSequence {

  /** Construct the sequence. */
  public A256016() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(k).pow(n), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
