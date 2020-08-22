package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A122749 Number of arrangements of n non-attacking bishops on an n X n board such that every square of the board is controlled by at least one bishop.
 * @author Sean A. Irvine
 */
public class A122749 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final long k = mN / 2;
    if ((mN & 1) == 0) {
      if ((k & 1) == 0) {
        if (k > 1) {
          mF = mF.multiply(k).multiply(k - 1);
        }
        return mF.multiply(k + 2).divide2().square();
      } else {
        return mF.multiply(k + 1).multiply(k + 1).divide2().square();
      }
    } else {
      if ((k & 1) == 0) {
        return mF.square().multiply(Z.THREE.multiply(k).add(16).multiply(k).add(18).multiply(k).add(8)).divide(12);
      } else {
        return mF.square().multiply(k).multiply(k + 1).multiply(Z.THREE.multiply(k).add(13).multiply(k).subtract(1).multiply(k).subtract(3)).divide(12);
      }
    }
  }
}
