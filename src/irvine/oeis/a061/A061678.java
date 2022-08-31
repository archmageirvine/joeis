package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A061678 Continued fraction for Sum_{n&gt;=0} 1/3^(3^n).
 * @author Georg Fischer
 */
public class A061678 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A061678() {
    super(0, k -> Z.THREE.pow(Z.THREE.pow(k)), new long[] {0, 2, 1, 2, 3});
  }
}
