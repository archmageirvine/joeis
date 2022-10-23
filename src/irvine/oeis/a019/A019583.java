package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019583 a(n) = n*(n-1)^4/2.
 * @author Sean A. Irvine
 */
public class A019583 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).pow(4).multiply(++mN).divide2();
  }
}
