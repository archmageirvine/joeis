package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008605 Multiples of 23.
 * @author Sean A. Irvine
 */
public class A008605 extends Sequence0 {

  private Z mN = Z.valueOf(-23);

  @Override
  public Z next() {
    mN = mN.add(23);
    return mN;
  }
}

