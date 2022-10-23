package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008589 Multiples of 7.
 * @author Sean A. Irvine
 */
public class A008589 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN;
  }
}

