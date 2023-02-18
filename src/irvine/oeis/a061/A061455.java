package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A061455 Triangular numbers whose digit reversal is also a triangular number.
 * @author Sean A. Irvine
 */
public class A061455 extends A000217 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (ZUtils.isTriangular(ZUtils.reverse(t))) {
        return t;
      }
    }
  }
}

