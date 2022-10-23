package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001505 a(n) = (4n+1)(4n+2)(4n+3).
 * @author Sean A. Irvine
 */
public class A001505 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.multiply(mN.add(1)).multiply(mN.add(2));
  }
}
