package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390123 allocated for Taylor McAdam.
 * @author Sean A. Irvine
 */
public class A390123 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      final long nd = mN / d;
      if (dd.modPow(mN / d, nd).equals(dd.modZ(nd))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
