package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001094.
 * @author Sean A. Irvine
 */
public class A001094 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.subtract(1)).multiply(mN.subtract(2)).multiply(mN.subtract(3)).add(mN);
  }
}

