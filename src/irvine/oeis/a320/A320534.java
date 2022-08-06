package irvine.oeis.a320;
// manually hygeom at 2022-08-06 18:18

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A320534 a(n) = ((1 + sqrt(4*n^2 + 1))^n + (1 - sqrt(4*n^2 + 1))^n)/2^n.
 * @author Georg Fischer
 */
public class A320534 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A320534() {
    super(1, 2, 1, "[[1/2,-1/2],[0,-1/2],[1/2],[1, 0, 4]]");
  }

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.TWO;
    } else {
      return super.nextQ().divide(Z.ONE.shiftLeft(mN - 1)).num();
    }
  }
}
