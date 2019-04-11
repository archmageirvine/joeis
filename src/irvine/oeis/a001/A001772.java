package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001772 Numbers n such that <code>11*2^n - 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A001772 implements Sequence {

  private Z mP = Z.valueOf(44);
  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (mN > 2) {
        mP = mP.shiftLeft(4);
      }
      if (mP.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
