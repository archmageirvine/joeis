package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016896 a(n) = (5*n + 3)^12.
 * @author Sean A. Irvine
 */
public class A016896 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

