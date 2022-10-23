package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008601 Multiples of 19.
 * @author Sean A. Irvine
 */
public class A008601 extends Sequence0 {

  private Z mN = Z.valueOf(-19);

  @Override
  public Z next() {
    mN = mN.add(19);
    return mN;
  }
}

