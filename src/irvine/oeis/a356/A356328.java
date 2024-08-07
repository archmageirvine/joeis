package irvine.oeis.a356;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356328 a(n) = n! * Sum_{k=0..floor(n/3)} (n - 3*k)^k/(6^k * (n - 3*k)!).
 * @author Georg Fischer
 */
public class A356328 extends LambdaSequence {

  /** Construct the sequence. */
  public A356328() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.valueOf(n - 3L * k).pow(k), Z.SIX.pow(k).multiply(Functions.FACTORIAL.z(n - 3 * k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
