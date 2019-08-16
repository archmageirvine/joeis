package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025164 <code>a(n) = a(n-2) + (2n-1)a(n-1); a(0)=1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A025164 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.add(mB.multiply(2 * mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
