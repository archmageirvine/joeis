package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004320 a(n) = n*(n+1)*(n+2)^2/6.
 * @author Sean A. Irvine
 */
public class A004320 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2).square()).divide(6);
  }
}

