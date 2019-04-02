package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008601 Multiples of 19.
 * @author Sean A. Irvine
 */
public class A008601 implements Sequence {

  private Z mN = Z.valueOf(-19);

  @Override
  public Z next() {
    mN = mN.add(19);
    return mN;
  }
}

