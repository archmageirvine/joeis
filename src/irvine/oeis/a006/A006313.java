package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006313.
 * @author Sean A. Irvine
 */
public class A006313 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(16).add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

