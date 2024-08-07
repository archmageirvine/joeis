package irvine.oeis.a357;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A357087 E.g.f. satisfies A(x) * log(A(x)) = (exp(x*A(x)) - 1)^3.
 * @author Georg Fischer
 */
public class A357087 extends LambdaSequence {

  /** Construct the sequence. */
  public A357087() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(n - k + 1).pow(k - 1).multiply(Functions.STIRLING2.z(n, 3L * k)).multiply(Functions.FACTORIAL.z(3 * k)).divide(Functions.FACTORIAL.z(k))).num());
  }
}
