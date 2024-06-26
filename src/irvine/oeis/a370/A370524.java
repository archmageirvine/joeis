package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A370524 Number of permutations of [n] having exactly one adjacent 2-cycle.
 * @author Georg Fischer
 */
public class A370524 extends LambdaSequence {

  /** Construct the sequence. */
  public A370524() {
    super(0, n -> {
      final int k = 1;
      final int q = 2;
      return Rationals.SINGLETON.sum(0, n / q - k, j -> new Q(Z.NEG_ONE.pow(j).multiply(Functions.FACTORIAL.z(n - (q - 1) * (j + k))), Functions.FACTORIAL.z(j).multiply(Functions.FACTORIAL.z(k)))).num();
    });
  }
}
