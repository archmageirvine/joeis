package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002235 Numbers n such that <code>3*2^n - 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A002235 implements Sequence {

  private long mN = -1;
  private Z mM = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mM = mM.shiftLeft(1);
      }
      if (mM.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
