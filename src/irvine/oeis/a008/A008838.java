package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008838 a(n) = floor(n/8)*ceiling(n/8).
 * @author Sean A. Irvine
 */
public class A008838 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(8).multiply(mN.add(7).divide(8));
  }
}


