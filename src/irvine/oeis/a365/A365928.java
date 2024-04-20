package irvine.oeis.a365;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365928 Smallest prime factor of f(n) = 10^(2*n) + (10^n - 1)/9.
 * @author Georg Fischer
 */
public class A365928 extends LambdaSequence {

  /** Construct the sequence. */
  public A365928() {
    super(1, n -> Functions.LPF.z(Z.TEN.pow(2L * n).add((Z.TEN.pow(n).subtract(1)).divide(9))));
  }
}
