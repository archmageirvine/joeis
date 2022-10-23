package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008597 Multiples of 15.
 * @author Sean A. Irvine
 */
public class A008597 extends Sequence0 {

  private Z mN = Z.valueOf(-15);

  @Override
  public Z next() {
    mN = mN.add(15);
    return mN;
  }
}

