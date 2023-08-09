package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065035 a(n+1) = a(n)^2 + 3*a(n) + 1.
 * @author Sean A. Irvine
 */
public class A065035 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.square().add(mA.multiply(3)).add(1);
    return mA;
  }
}

