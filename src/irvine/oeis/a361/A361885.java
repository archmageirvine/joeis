package irvine.oeis.a361;
// manually 2026-09-08/lambdan at 2026-09-08 23: 19

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A361885 a(n) = (1/n) * Sum_{k = 0..2*n} (n+2*k) * binomial(n+k-1,k)^3.
 * @author Georg Fischer
 */
public class A361885 extends LambdaSequence {

  /** Construct the sequence. */
  public A361885() {
    super(1, n -> Integers.SINGLETON.sum(0, 2 * n, k -> Z.valueOf(n + 2 * k).multiply(Binomial.binomial(n + k - 1, k).pow(3))).divide(n));
  }
}
