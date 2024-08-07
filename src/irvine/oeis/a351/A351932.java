package irvine.oeis.a351;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351932 Number of set partitions of [n] such that block sizes are either 1 or 4.
 * @author Georg Fischer
 */
public class A351932 extends LambdaSequence {

  /** Construct the sequence. */
  public A351932() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 4, k -> new Q(Binomial.binomial(n - 3L * k, k), Z.valueOf(24).pow(k).multiply(Functions.FACTORIAL.z(n - 3 * k)))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
