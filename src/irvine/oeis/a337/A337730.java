package irvine.oeis.a337;
// Generated by gen_seq4.pl 2024-03-14g/lambdan at 2024-03-14 21:15

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A337730 a(n) = (4*n+3)! * Sum_{k=0..n} 1 / (4*k+3)!.
 * @author Georg Fischer
 */
public class A337730 extends LambdaSequence {

  /** Construct the sequence. */
  public A337730() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.ONE, Functions.FACTORIAL.z(4 * k + 3))).multiply(Functions.FACTORIAL.z(n * 4 + 3)).num());
  }
}
