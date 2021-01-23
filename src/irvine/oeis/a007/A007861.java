package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007861 Mahonian statistics on S_n which split (a(n)=n!.a(n-1)^n).
 * @author Sean A. Irvine
 */
public class A007861 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      mA = mA.pow(mN).multiply(mF);
    }
    return mA;
  }
}
