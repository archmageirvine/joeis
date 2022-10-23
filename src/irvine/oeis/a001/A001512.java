package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001512 a(n) = (5*n+1)*(5*n+2)*(5*n+3)*(5*n+4).
 * @author Sean A. Irvine
 */
public class A001512 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(3));
  }
}
