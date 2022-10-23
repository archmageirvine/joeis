package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008593 Multiples of 11.
 * @author Sean A. Irvine
 */
public class A008593 extends Sequence0 {

  private Z mN = Z.valueOf(-11);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN;
  }
}

