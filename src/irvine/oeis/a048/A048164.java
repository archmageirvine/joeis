package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048164 a(0)=1, a(n+1)=1+(2^(2^n)+1)*a(n).
 * @author Sean A. Irvine
 */
public class A048164 extends Sequence0 {

  private int mN = -2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.shiftLeft(1L << mN).add(mA).add(1);
    }
    return mA;
  }
}

