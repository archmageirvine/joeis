package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002943 a(n) = 2*n*(2*n+1).
 * @author Sean A. Irvine
 */
public class A002943 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.multiply(mN.add(1));
  }
}
