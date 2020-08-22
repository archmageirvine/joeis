package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002552 Denominators of coefficients in Taylor series expansion of log(1+x)^2/sqrt(1+x).
 * @author Sean A. Irvine
 */
public class A002552 extends A002551 {

  @Override
  public Z next() {
    return step().den();
  }
}
