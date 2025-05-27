package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077520 a(1) = 1, a(n) = smallest prime of the form k*a(n-1)+1 starting with n.
 * @author Sean A. Irvine
 */
public class A077520 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final String s = String.valueOf(mN);
      final Z t = mA;
      mA = mA.add(1);
      while (!mA.isProbablePrime() || !mA.toString().startsWith(s)) {
        mA = mA.add(t);
      }
    }
    return mA;
  }
}
