package irvine.oeis.a333;

import irvine.math.BinaryLambdaCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333479 Busy Beaver for lambda calculus.
 * @author Gregory Morse
 */
public class A333479 extends Sequence1 {

  private int mN;

  /**
   * Get a maximum, caching only results of the slow zero-holdout scans.
   * @param n encoded program size
   * @return maximum beta normal-form size
   */
  public static Z maximum(final int n) {
    switch (n) {
      case 34:
        // Regenerate with BinaryLambdaCensus --maximum 34.
        return Z.FIVE.shiftLeft(16).add(6);
      case 35:
        return Z.THREE.pow(27).multiply(5).add(6);
      case 36:
        return Z.ONE.shiftLeft(256).multiply(5).add(6);
      default:
        return BinaryLambdaCensus.maximum(n);
    }
  }

  @Override
  public Z next() {
    return maximum(++mN);
  }
}
