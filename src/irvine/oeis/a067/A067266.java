package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A067266 Numbers k such that omega(k) = M(k) where omega(k) is A001221(k) and M(n) is the Mertens function A002321(k).
 * @author Sean A. Irvine
 */
public class A067266 extends A002321 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == super.next().longValueExact()) {
        return Z.valueOf(mN);
      }
    }
  }
}

