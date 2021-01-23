package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036978 Numbers for which the "describe what you see" transform A045918 produces a prime.
 * @author Sean A. Irvine
 */
public class A036978 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (ZUtils.describe(mN).isProbablePrime()) {
        return mN;
      }
    }
  }
}

