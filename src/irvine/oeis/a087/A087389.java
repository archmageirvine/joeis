package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087386.
 * @author Sean A. Irvine
 */
public class A087389 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return Z.THREE;
    }
    mA = Functions.REVERSE.z(mA).multiply(10);
    long lim = 10;
    long k = -1;
    while (true) {
      k += 2;
      if (k >= lim) {
        mA = mA.multiply(10);
        lim *= 10;
        k = 1;
      }
      final Z t = mA.add(k);
      if (t.isProbablePrime()) {
        mA = t;
        return t;
      }
    }
  }
}

