package irvine.oeis.a356;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356401 a(n) = n! * Sum_{k=1..n} Sum_{d|k} (-1)^(d+1)/(d * (k/d)!).
 * @author Georg Fischer
 */
public class A356401 extends LambdaSequence {

  /** Construct the sequence. */
  public A356401() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> Rationals.SINGLETON.sumdiv(k, d -> new Q(Z.NEG_ONE.pow(d + 1)).divide(Z.valueOf(d).multiply(Functions.FACTORIAL.z(k / d))))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
