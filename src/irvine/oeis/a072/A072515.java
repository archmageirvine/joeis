package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072515 Let u(1) = u(2) = v(1) = v(2) = 1, u(n+2) = u(n)+v(n+1), v(n+2) = abs(u(n)-v(n+1)), then a(n) = u(n).
 * @author Sean A. Irvine
 */
public class A072515 extends Sequence1 {

  private Z mU1 = null;
  private Z mU2 = null;
  private Z mV2 = Z.ONE;

  @Override
  public Z next() {
    if (mU2 == null) {
      if (mU1 == null) {
        mU1 = Z.ONE;
        return Z.ONE;
      }
      mU2 = Z.ONE;
      return Z.ONE;
    }
    final Z u = mU1.add(mV2);
    final Z v = mU1.subtract(mV2).abs();
    mU1 = mU2;
    mU2 = u;
    mV2 = v;
    return u;
  }
}
