package irvine.oeis.a199;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A199295 Smallest prime factor of n^(n^n) + 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A199295 extends LambdaSequence {

  /** Construct the sequence. */
  public A199295() {
    super(1, n -> (n & 1) == 1 ? Z.TWO : Functions.LPF.z(Z.valueOf(n).pow(Z.valueOf(n).pow(n)).add(1)));
  }
}
