package irvine.oeis.a354;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A354508 a(n) = n! * Sum_{k=1..n} ( Sum_{d|k} (-1)^(k/d+1) * d^2 )/(k * (n-k)!).
 * @author Georg Fischer
 */
public class A354508 extends LambdaSequence {

  /** Construct the sequence. */
  public A354508() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> Rationals.SINGLETON.sumdiv(k, d -> new Q(Z.NEG_ONE.pow(k / d + 1).multiply((long) d * d))).divide(Z.valueOf(k).multiply(Functions.FACTORIAL.z(n - k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
