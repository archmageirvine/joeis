package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002550 Denominators of coefficients of log(1+x)/sqrt(1+x).
 * @author Sean A. Irvine
 */
public class A002550 extends A002549 {

  @Override
  public Z next() {
    return step().den();
  }
}
