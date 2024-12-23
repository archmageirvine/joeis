package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073893 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    long k = 0;
    long m = 10;
    while (true) {
      if (++k == m) {
        m *= 10;
        mA = mA.multiply(10);
      }
      final Z t = mA.add(k);
      if (t.mod(mN) == 0) {
        mA = t;
        return Z.valueOf(k);
      }
    }
  }
}

