package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A080112 Positions of A080114 in A000040.
 * @author Sean A. Irvine
 */
public class A080112 extends A065091 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (A080114.is(p.longValueExact())) {
        return Z.valueOf(mN);
      }
    }
  }
}
