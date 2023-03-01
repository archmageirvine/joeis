package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A257093 a(n) = n*(n+1)*(13*n+2)/6.
 * @author Sean A. Irvine
 */
public class A257093 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(13 * mN + 2).divide(6);
  }
}
