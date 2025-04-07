package irvine.oeis.a076;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A076498 Class number h(p) of real quadratic field Q(sqrt(p)) where p is n-th prime == 1 mod 4.
 * @author Sean A. Irvine
 */
public class A076498 extends A002144 {

  @Override
  public Z next() {
    return Z.valueOf(QuadraticFieldUtils.classNumber(super.next()));
  }
}
