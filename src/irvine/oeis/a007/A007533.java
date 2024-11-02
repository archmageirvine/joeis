package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007533 a(n) = (5*n + 1)^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A007533 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(25).add(14).multiply(mN).add(2);
  }
}
