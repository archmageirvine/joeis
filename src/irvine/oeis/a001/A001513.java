package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001513 a(n) = (6n+1)*(6n+5).
 * @author Sean A. Irvine
 */
public class A001513 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.multiply(mN.add(4));
  }
}
