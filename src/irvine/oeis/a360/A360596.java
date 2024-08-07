package irvine.oeis.a360;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A360596 Expansion of e.g.f. 1/( (1 - x) * (1 + LambertW(-2*x)) ).
 * @author Georg Fischer
 */
public class A360596 extends LambdaSequence {

  /** Construct the sequence. */
  public A360596() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(2L * k).pow(k), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
