package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008600 Multiples of 18.
 * @author Sean A. Irvine
 */
public class A008600 implements Sequence {

  private Z mN = Z.valueOf(-18);

  @Override
  public Z next() {
    mN = mN.add(18);
    return mN;
  }
}

