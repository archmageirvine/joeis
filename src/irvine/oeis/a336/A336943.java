package irvine.oeis.a336;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A336943 Least prime factor of 44745755^4 + 2^(4n+2).
 * @author Georg Fischer
 */
public class A336943 extends LambdaSequence {

  private static final Z C = Z.valueOf(44745755).pow(4);

  /** Construct the sequence. */
  public A336943() {
    super(0, n -> LeastPrimeFactorizer.lpf(C.add(Z.TWO.pow(4L * n + 2))));
  }
}
