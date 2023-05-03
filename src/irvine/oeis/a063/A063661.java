package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063661 a(n) = A063660(n) - n.
 * @author Sean A. Irvine
 */
public class A063661 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final int syn = LongUtils.syndrome(++mN);
    long k = mN;
    while (true) {
      if ((syn & LongUtils.syndrome(++k)) != 0) {
        return Z.valueOf(k - mN);
      }
    }
  }
}
