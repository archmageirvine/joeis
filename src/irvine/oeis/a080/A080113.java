package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080113 Positions of A080115 in A000040.
 * @author Sean A. Irvine
 */
public class A080113 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (!A080114.is(p.longValueExact())) {
        return Z.valueOf(mN);
      }
    }
  }
}
