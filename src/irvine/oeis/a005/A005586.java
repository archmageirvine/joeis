package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005586 a(n) = n*(n+4)*(n+5)/6.
 * @author Sean A. Irvine
 */
public class A005586 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(4)).multiply(mN.add(5)).divide(6);
  }
}

