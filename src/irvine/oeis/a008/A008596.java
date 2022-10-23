package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008596 Multiples of 14.
 * @author Sean A. Irvine
 */
public class A008596 extends Sequence0 {

  private Z mN = Z.valueOf(-14);

  @Override
  public Z next() {
    mN = mN.add(14);
    return mN;
  }
}

