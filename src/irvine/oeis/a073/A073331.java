package irvine.oeis.a073;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A073331.
 * @author Sean A. Irvine
 */
public class A073331 extends A002034 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final long v = super.next().longValue();
    long k = 0;
    while (true) {
      ++k;
      if (v == Cheetah.factor(mN + k).sigma0()) {
        return Z.valueOf(k);
      }
    }
  }
}

