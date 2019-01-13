package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006314.
 * @author Sean A. Irvine
 */
public class A006314 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(8).add(1).isProbablePrime()) {
        return mN;
      }
    }
  }
}

