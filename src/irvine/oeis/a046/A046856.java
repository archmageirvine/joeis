package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046856 a(n) = (2^n)!/4^n, with a(1)=1, a(2)=2.
 * @author Sean A. Irvine
 */
public class A046856 extends Sequence1 {

  private int mN = 0;
  private Z mA = Z.valueOf(45);
  private long mM = 7;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    while (mM <= 1L << mN) {
      mA = mA.multiply(mM++);
    }
    mA = mA.shiftRight(2);
    return mA;
  }
}
