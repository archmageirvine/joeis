package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061420 a(n) = a(ceiling((n-1)*2/3)) + 1 with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A061420 extends A061419 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private long mT = super.next().longValueExact();
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN > 0 && mN == mT) {
      mA = mA.add(1);
      mT = super.next().longValueExact();
    }
    return mA;
  }
}

