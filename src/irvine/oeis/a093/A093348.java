package irvine.oeis.a093;
// manually 2025-10-29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A093348 A 5-fractal "castle" starting with 0.
 * @author Georg Fischer
 */
public class A093348 extends LambdaSequence {

  /** Construct the sequence. */
  public A093348() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, i -> Z.NEG_ONE.pow(i).multiply(Z.FIVE.pow(Functions.VALUATION.i(i, Z.FIVE)))).negate());
  }
}
