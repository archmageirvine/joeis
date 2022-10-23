package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016061 a(n) = n*(n+1)*(4*n+5)/6.
 * @author Sean A. Irvine
 */
public class A016061 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(4 * mN + 5).divide(6);
  }
}
