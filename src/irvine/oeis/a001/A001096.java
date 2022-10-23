package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001096 a(n) = n + n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5).
 * @author Sean A. Irvine
 */
public class A001096 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.subtract(1)).multiply(mN.subtract(2)).multiply(mN.subtract(3)).multiply(mN.subtract(4)).multiply(mN.subtract(5)).add(mN);
  }
}

