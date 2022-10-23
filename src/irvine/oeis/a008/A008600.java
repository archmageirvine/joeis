package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008600 Multiples of 18.
 * @author Sean A. Irvine
 */
public class A008600 extends Sequence0 {

  private Z mN = Z.valueOf(-18);

  @Override
  public Z next() {
    mN = mN.add(18);
    return mN;
  }
}

