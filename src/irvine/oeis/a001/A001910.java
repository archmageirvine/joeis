package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001910 a(n) = n*a(n-1) + (n-5)*a(n-2).
 * @author Sean A. Irvine
 */
public class A001910 implements Sequence {

  private long mN = 2;
  private Z mA = Z.NEG_ONE;
  private Z mB = null;

  @Override
  public Z next() {
    ++mN;
    if (mB == null) {
      mB = Z.ZERO;
    } else {
      final Z t = mA.multiply(mN - 5).add(mB.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
