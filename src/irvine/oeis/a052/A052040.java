package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052040 Numbers whose square is zeroless.
 * @author Sean A. Irvine
 */
public class A052040 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!ZUtils.containsZero(mN.square())) {
        return mN;
      }
    }
  }
}

