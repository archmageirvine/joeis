package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;

/**
 * A061458 Cubes whose digit reversal is also a cube.
 * @author Sean A. Irvine
 */
public class A061458 extends A000578 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z r = ZUtils.reverse(t);
      r.root(3);
      if (r.auxiliary() == 1) {
        return t;
      }
    }
  }
}

