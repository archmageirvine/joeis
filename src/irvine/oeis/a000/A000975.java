package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000975 a(2n) = 2*a(2n-1), a(2n+1) = 2*a(2n)+1 (also a(n) is the n-th number without consecutive equal binary digits).
 * @author Sean A. Irvine
 */
public class A000975 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ZERO;
    } else {
      final Z t = mB.add(mA.multiply2()).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
