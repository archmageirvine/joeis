package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006552.
 * @author Sean A. Irvine
 */
public class A006552 implements Sequence {

  private long mN = 1;
  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.multiply(mN).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
