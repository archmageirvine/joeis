package irvine.oeis.a347;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A347993 a(n) = n! * Sum_{k=1..n} (-1)^(k+1) * n^(n-k) / (n-k)!.
 * @author Georg Fischer
 */
public class A347993 extends LambdaSequence {

  /** Construct the sequence. */
  public A347993() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.NEG_ONE.pow(k + 1).multiply(Z.valueOf(n).pow(n - k)), Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
