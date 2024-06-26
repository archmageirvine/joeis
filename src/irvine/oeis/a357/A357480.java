package irvine.oeis.a357;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357480 a(n) = (n!/24) * Sum_{k=0..n-4} 1/k!.
 * @author Georg Fischer
 */
public class A357480 extends LambdaSequence {

  /** Construct the sequence. */
  public A357480() {
    super(0, n -> Rationals.SINGLETON.sum(0, n - 4, k -> new Q(Z.ONE, Functions.FACTORIAL.z(k)).divide(Z.valueOf(24))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
