package irvine.oeis.a365;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365966 Smallest prime factor of f(n) = 10^(2*n+1) + (10^n-1)/9.
 * @author Georg Fischer
 */
public class A365966 extends LambdaSequence {

  /** Construct the sequence. */
  public A365966() {
    super(0, n -> LeastPrimeFactorizer.lpf(Z.TEN.pow(2L * n + 1).add((Z.TEN.pow(n).subtract(1)).divide(9))));
  }
}
