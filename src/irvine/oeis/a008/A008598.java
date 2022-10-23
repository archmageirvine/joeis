package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008598 Multiples of 16.
 * @author Sean A. Irvine
 */
public class A008598 extends Sequence0 {

  private Z mN = Z.valueOf(-16);

  @Override
  public Z next() {
    mN = mN.add(16);
    return mN;
  }
}

