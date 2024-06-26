package irvine.oeis.a346;
// Generated by gen_seq4.pl 2023-11-26/lambdan at 2023-11-26 23:29

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A346410 a(n) = (n!)^2 * Sum_{k=0..n-1} 1 / ((n-k) * k!)^2.
 * @author Georg Fischer
 */
public class A346410 extends LambdaSequence {

  /** Construct the sequence. */
  public A346410() {
    super(0, n -> Rationals.SINGLETON.sum(0, n - 1, k -> new Q(Z.ONE, Z.valueOf(n - k).multiply(Functions.FACTORIAL.z(k)).square())).multiply(Functions.FACTORIAL.z(n).square()).num());
  }
}
