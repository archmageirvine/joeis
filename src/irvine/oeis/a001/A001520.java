package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001520 a(n) = (6*n+1)*(6*n+3)*(6*n+5).
 * @author Sean A. Irvine
 */
public class A001520 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.multiply(mN.add(2)).multiply(mN.add(4));
  }
}
