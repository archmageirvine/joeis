package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-06-14/eultra1  at 2024-06-14 23:07

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A362627 Euler transform of sigma_n(n) (sum of n-th powers of divisors of n).
 * @author Georg Fischer
 */
public class A362627 extends EulerTransform {

  /** Construct the sequence. */
  public A362627() {
    super(0, new LambdaSequence(1, n -> Functions.SIGMA.z(n, n)), 1);
  }
}
