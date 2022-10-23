package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008599 Multiples of 17.
 * @author Sean A. Irvine
 */
public class A008599 extends Sequence0 {

  private Z mN = Z.valueOf(-17);

  @Override
  public Z next() {
    mN = mN.add(17);
    return mN;
  }
}

