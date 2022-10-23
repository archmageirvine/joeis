package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005563 a(n) = n*(n+2) = (n+1)^2 - 1.
 * @author Sean A. Irvine
 */
public class A005563 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().subtract(1);
  }
}

