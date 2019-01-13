package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001095.
 * @author Sean A. Irvine
 */
public class A001095 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.subtract(1)).multiply(mN.subtract(2)).multiply(mN.subtract(3)).multiply(mN.subtract(4)).add(mN);
  }
}

