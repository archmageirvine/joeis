package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087358 a(n+1) is the smallest prime &gt; a(n) such that a(n+1) - a(n) == 0 (mod n^n).
 * @author Sean A. Irvine
 */
public class A087358 extends Sequence1 {

  // After Robert Israel

  private Z mA = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN >= 1) {
      if (mN == 1) {
        mA = Z.THREE;
      } else {
        final Z mod = Z.valueOf(mN).pow(mN).multiply((mN & 1) == 1 ? 2 : 1);
        Z t = mA;
        do {
          t = t.add(mod);
        } while (!t.isProbablePrime());
        mA = t;
      }
    }
    return mA;
  }
}
