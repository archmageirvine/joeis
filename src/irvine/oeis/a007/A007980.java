package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007980.
 * @author Sean A. Irvine
 */
public class A007980 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).add(2).divide(3);
  }
}
