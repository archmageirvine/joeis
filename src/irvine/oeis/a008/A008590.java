package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008590 Multiples of 8.
 * @author Sean A. Irvine
 */
public class A008590 extends Sequence0 {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN;
  }
}

