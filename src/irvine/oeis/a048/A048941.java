package irvine.oeis.a048;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A048941.
 * @author Sean A. Irvine
 */
public class A048941 extends A000037 {

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[0];
  }
}

