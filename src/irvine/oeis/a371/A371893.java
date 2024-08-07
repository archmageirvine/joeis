package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-04-22/lambdan at 2024-04-22 22:28

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371893 G.f. A(x) satisfies A(x) = 1 + x/A(x)^2 * (1 + A(x)^4).
 * @author Georg Fischer
 */
public class A371893 extends LambdaSequence {

  /** Construct the sequence. */
  public A371893() {
    super(0, n -> n == 0 ? Z.ONE : Z.NEG_ONE.pow(n - 1).multiply(Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(3L * n - 4L * k - 2, n - 1)))).divide(n));
  }
}
