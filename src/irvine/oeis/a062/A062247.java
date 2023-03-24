package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a141.A141900;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A062247 extends A141900 {

  private int mThrees = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final int v = ZUtils.valuation(t, Z.THREE);
      if (v > mThrees) {
        mThrees = v;
        return Z.valueOf(mN);
      }
    }
  }
}

