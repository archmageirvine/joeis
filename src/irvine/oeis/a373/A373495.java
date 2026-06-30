package irvine.oeis.a373;
// manually 2026-06-30

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A373495 a(1) = 2; thereafter, a(n) = prime(n)^prime(n-1) (mod 10).
 * @author Georg Fischer
 */
public class A373495 extends LambdaSequence {

  /** Construct the sequence. */
  public A373495() {
    super(1, n -> Functions.PRIME.z(n).modPow(Functions.PRIME.z(n - 1), Z.TEN), 2);
  }
}
