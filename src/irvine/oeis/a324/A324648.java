package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-07-12/lambdan at 2024-07-12 23:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A324648 a(n) = n - A318458(n), where A318458(n) is bitwise-AND of n and the sum of proper divisors of n (sigma(n)-n).
 * @author Georg Fischer
 */
public class A324648 extends LambdaSequence {

  /** Construct the sequence. */
  public A324648() {
    super(1, n -> Z.valueOf(n).subtract(Functions.SIGMA1.z(n).subtract(n).and(Z.valueOf(n))));
  }
}
