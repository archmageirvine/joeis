package irvine.oeis.a048;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A048941 Smallest positive integer x such that x^2 - A000037(n)*y^2 = +-4 for some positive integer y.
 * @author Sean A. Irvine
 */
public class A048941 extends A000037 {

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[0];
  }
}

