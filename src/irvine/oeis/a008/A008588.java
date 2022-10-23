package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008588 Nonnegative multiples of 6.
 * @author Sean A. Irvine
 */
public class A008588 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN;
  }
}

