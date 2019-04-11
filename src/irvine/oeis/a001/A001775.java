package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001775 Numbers n such that <code>19*2^n-1</code> is prime.
 * @author Sean A. Irvine
 */
public class A001775 implements Sequence {

  private Z mP = Z.valueOf(19 * 2);
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN > 1) {
        mP = mP.shiftLeft(2);
      }
      if (mP.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
