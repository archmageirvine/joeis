package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A268219 a(n) = (n!/4!)*Sum(1/k!,k=1..n-4).
 * @author Georg Fischer
 */
public class A268219 extends LambdaSequence {

  /** Construct the sequence. */
  public A268219() {
    super(0, n -> Rationals.SINGLETON.sum(1, n - 4, k -> new Q(Z.ONE, Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).divide(24).num());
  }
}
