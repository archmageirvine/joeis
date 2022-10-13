package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A059853 Period of continued fraction for sqrt(n^2+3), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A059853 extends A003285 {

  {
    mN = 1;
  }

  @Override
  public Z next() {
    return period(Z.valueOf(++mN).square().add(3));
  }
}
