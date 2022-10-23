package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005582 a(n) = n*(n+1)*(n+2)*(n+7)/24.
 * @author Sean A. Irvine
 */
public class A005582 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(7)).divide(24);
  }
}

