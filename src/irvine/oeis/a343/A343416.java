package irvine.oeis.a343;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A343416 a(n) = A001414(n) + A000203(n) + A001414(A000203(n)) + A000203(A001414(n)).
 * @author Georg Fischer
 */
public class A343416 extends LambdaSequence {

  /** Construct the sequence. */
  public A343416() {
    super(1, n -> (n == 1) ? Z.ONE : Functions.SOPFR.z(n).add(Functions.SIGMA.z(1, n)).add(Functions.SOPFR.z(Functions.SIGMA.z(1, n))).add(Functions.SIGMA.z(1, Functions.SOPFR.z(n))));
  }
}
