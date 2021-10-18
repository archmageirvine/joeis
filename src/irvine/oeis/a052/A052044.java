package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052044 Numbers k such that k^3 lacks the digit zero in its decimal expansion.
 * @author Sean A. Irvine
 */
public class A052044 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!ZUtils.containsZero(mN.pow(3))) {
        return mN;
      }
    }
  }
}

