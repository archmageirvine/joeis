package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-03/lambdan at 2024-06-03 22:35

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351416 Number of divisors of n that are either squarefree semiprimes, numbers of the form p^k (p prime, k&gt;1), or numbers with at least one square divisor &gt; 1 and 3 or more distinct prime factors.
 * @author Georg Fischer
 */
public class A351416 extends LambdaSequence {

  /** Construct the sequence. */
  public A351416() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> (Functions.OMEGA.i(d) == 2 ? Z.ONE : Z.ZERO).equals(Functions.MOEBIUS.z(d).square()) ? Z.ONE : Z.ZERO));
  }
}
