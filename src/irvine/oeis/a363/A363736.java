package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363736 a(n) = (n-1)! * Sum_{d|n} (-1)^(d+1) / (d-1)!.
 * @author Georg Fischer
 */
public class A363736 extends LambdaSequence {

  /** Construct the sequence. */
  public A363736() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Z.NEG_ONE.pow(d + 1), Functions.FACTORIAL.z(d - 1))).multiply(Functions.FACTORIAL.z(n - 1)).num());
  }
}
