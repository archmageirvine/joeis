package irvine.oeis.a173;
// Generated by gen_seq4.pl 2023-08-29/lambda at 2023-08-29 23:04

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A173983 a(n) = numerator((Zeta(2, 1/3) - Zeta(2, n + 1/3))/9), where Zeta(n, z) is the Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A173983 extends LambdaSequence {

  /** Construct the sequence. */
  public A173983() {
    super(0, n -> Rationals.SINGLETON.sum(0, n - 1, k -> new Q(Z.ONE, Z.valueOf(k).multiply(3).add(1).square())).num());
  }
}
