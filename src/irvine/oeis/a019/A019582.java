package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019582 a(n) = n*(n - 1)^3/2.
 * @author Sean A. Irvine
 */
public class A019582 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).pow(3).multiply(++mN).divide2();
  }
}
