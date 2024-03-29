package irvine.oeis.a173;
// Generated by gen_seq4.pl 2023-08-29/lambda at 2023-08-29 23:04

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A173955 a(n) = numerator of (Zeta(2, 3/4) - Zeta(2, n-1/4))/16 where Zeta(n, a) is the Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A173955 extends LambdaSequence {

  /** Construct the sequence. */
  public A173955() {
    super(1, n -> Rationals.SINGLETON.sum(0, n - 2, k -> new Q(Z.ONE, Z.valueOf(k).multiply(4).add(3).square())).num());
  }
}
