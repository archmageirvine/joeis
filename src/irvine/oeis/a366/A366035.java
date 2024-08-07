package irvine.oeis.a366;
// Generated by gen_seq4.pl 2023-09-28/lambda0 at 2023-09-28 21:04

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366035 G.f. A(x) satisfies: A(x) = x * (1 + A(x))^5 / (1 - 3 * A(x)).
 * @author Georg Fischer
 */
public class A366035 extends LambdaSequence {

  /** Construct the sequence. */
  public A366035() {
    super(0, n -> (n == 0) ? Z.ZERO : Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n + k - 1, k).multiply(Binomial.binomial(5L * n, n - k - 1)).multiply(Z.THREE.pow(k))).divide(n));
  }
}
