package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007019 <code>a(n) = (2n+1)! / 2^n</code>.
 * @author Sean A. Irvine
 */
public class A007019 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(2 * mN + 1);
    }
    return mA;
  }
}

