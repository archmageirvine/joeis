package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001526 a(n) = (7*n+1)*(7*n+6).
 * @author Sean A. Irvine
 */
public class A001526 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.multiply(mN.add(5));
  }
}
