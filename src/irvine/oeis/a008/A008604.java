package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008604 Multiples of 22.
 * @author Sean A. Irvine
 */
public class A008604 extends Sequence0 {

  private Z mN = Z.valueOf(-22);

  @Override
  public Z next() {
    mN = mN.add(22);
    return mN;
  }
}

