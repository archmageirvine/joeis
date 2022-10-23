package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008607 Multiples of 25.
 * @author Sean A. Irvine
 */
public class A008607 extends Sequence0 {

  private Z mN = Z.valueOf(-25);

  @Override
  public Z next() {
    mN = mN.add(25);
    return mN;
  }
}

