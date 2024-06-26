package irvine.oeis.a358;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A358852 a(n) = n!*Sum_{m=0..floor(n/3)} 1/binomial(n-m,2*m).
 * @author Georg Fischer
 */
public class A358852 extends LambdaSequence {

  /** Construct the sequence. */
  public A358852() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, m -> new Q(Z.ONE, Binomial.binomial(n - m, 2L * m))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
