package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-03-22/lambdan at 2024-03-24 22:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A091539 Second column (k=3) of array A091534 ((5,2)-Stirling2) divided by 10.
 * @author Georg Fischer
 */
public class A091539 extends LambdaSequence {

  /** Construct the sequence. */
  public A091539() {
    super(2, n -> Q.THREE.pow(2L * n).multiply(Rationals.SINGLETON.product(0, n - 1, j -> new Q(3L * j + 2, 3))).multiply(new Q(Functions.FACTORIAL.z(n)).subtract(Rationals.SINGLETON.product(0, n - 1, j -> new Q(3L * j + 1, 3)).multiply(Z.THREE))).divide(Functions.FACTORIAL.z(3).multiply(10)).num());
  }
}
