package irvine.oeis.a216;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A216146 Smallest prime factor of 3*(2n+1)^(2n+1) + 2.
 * @author Georg Fischer
 */
public class A216146 extends LambdaSequence {

  /** Construct the sequence. */
  public A216146() {
    super(0, n -> Functions.LPF.z(Z.valueOf(2L * n + 1).pow(2L * n + 1).multiply(3).add(2)));
  }
}
