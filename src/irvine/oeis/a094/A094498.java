package irvine.oeis.a094;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A094498 Least prime factor of 2^(4*n) + 3^(4*n) = 16^n + 81^n.
 * @author Georg Fischer
 */
public class A094498 extends LambdaSequence {

  /** Construct the sequence. */
  public A094498() {
    super(1, n -> Functions.LPF.z(Z.TWO.pow(4L * n).add(Z.THREE.pow(4L * n))));
  }
}
