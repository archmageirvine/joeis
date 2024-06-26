package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A368838 a(n) = n! * (n+3)! * Sum_{k=0..n} 1/(k! * (k+3)!).
 * @author Georg Fischer
 */
public class A368838 extends LambdaSequence {

  /** Construct the sequence. */
  public A368838() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.ONE, Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(k + 3)))).multiply(Functions.FACTORIAL.z(n + 3)).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
