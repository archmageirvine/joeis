package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001771 Numbers n such that <code>7*2^n - 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A001771 implements Sequence {

  private Z mP = Z.valueOf(14);
  private long mN = -3;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (mN > 1) {
        mP = mP.shiftLeft(4);
      }
      if (mP.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
