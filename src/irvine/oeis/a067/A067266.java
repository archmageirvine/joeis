package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067266 extends A002321 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == super.next().longValueExact()) {
        return Z.valueOf(mN);
      }
    }
  }
}

