package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008606 Multiples of 24.
 * @author Sean A. Irvine
 */
public class A008606 extends Sequence0 {

  private Z mN = Z.valueOf(-24);

  @Override
  public Z next() {
    mN = mN.add(24);
    return mN;
  }
}

