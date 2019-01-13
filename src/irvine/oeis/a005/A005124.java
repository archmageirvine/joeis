package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005124.
 * @author Sean A. Irvine
 */
public class A005124 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply(8).add(3).isProbablePrime()) {
        return mN;
      }
    }
  }
}

