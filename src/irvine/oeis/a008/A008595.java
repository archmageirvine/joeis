package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008595 Multiples of 13.
 * @author Sean A. Irvine
 */
public class A008595 extends Sequence0 {

  private Z mN = Z.valueOf(-13);

  @Override
  public Z next() {
    mN = mN.add(13);
    return mN;
  }
}

