package irvine.oeis.a347;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A347589 Continued fraction for Sum_{k&gt;=0} 1/2^(3^k).
 * @author Georg Fischer
 */
public class A347589 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A347589() {
    super(0, k -> Z.TWO.pow(Z.THREE.pow(k)), new long[] {0, 1, 1, 1, 2});
  }
}
