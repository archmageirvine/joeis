package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002253 Numbers n such that <code>3*2^n+1</code> is prime.
 * @author Sean A. Irvine
 */
public class A002253 implements Sequence {

  private long mN = 0;
  private Z mM = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(1);
      if (mM.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
