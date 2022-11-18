package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060393.
 * @author Sean A. Irvine
 */
public class A060399 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 10) {
      mN = 0;
    }
    while (true) {
      final Z p = super.next();
      if (ZUtils.digitCounts(p)[mN] > 0) {
        return p;
      }
    }
  }
}

