package irvine.oeis.a093;
// manually 2025-10-29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A093347 A 3-fractal "castle" starting with 0.
 * @author Georg Fischer
 */
public class A093347 extends LambdaSequence {

  /** Construct the sequence. */
  public A093347() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, i -> Z.NEG_ONE.pow(i).multiply(Z.THREE.pow(Functions.VALUATION.i(i, Z.THREE)))).negate());
  }
}
