package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007531 a(n) = n*(n-1)*(n-2) (or n!/(n-3)!).
 * @author Sean A. Irvine
 */
public class A007531 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN - 1).multiply(mN - 2);
  }
}
