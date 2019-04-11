package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000975 <code>a(2n) = 2*a(2n-1), a(2n+1) = 2*a(2n)+1</code> (also <code>a(n)</code> is the n-th number without consecutive equal binary digits).
 * @author Sean A. Irvine
 */
public class A000975 implements Sequence {

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
