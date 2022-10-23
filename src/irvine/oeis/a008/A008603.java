package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008603 Multiples of 21.
 * @author Sean A. Irvine
 */
public class A008603 extends Sequence0 {

  private Z mN = Z.valueOf(-21);

  @Override
  public Z next() {
    mN = mN.add(21);
    return mN;
  }
}

