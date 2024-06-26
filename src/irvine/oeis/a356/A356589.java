package irvine.oeis.a356;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356589 a(n) = n! * Sum_{k=1..n} sigma_k(k)/(k * (n-k)!).
 * @author Georg Fischer
 */
public class A356589 extends LambdaSequence {

  /** Construct the sequence. */
  public A356589() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Jaguar.factor(k).sigma(k), Z.valueOf(k).multiply(Functions.FACTORIAL.z(n - k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
