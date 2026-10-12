package irvine.oeis.a048;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A048942 Smallest positive integer y such that x^2 - A000037(n)*y^2 = +-4 for some positive integer x.
 * @author Sean A. Irvine
 */
public class A048942 extends A000037 {

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[1];
  }
}

