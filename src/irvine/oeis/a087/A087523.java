package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087523 a(0) = 2, a(n) = smallest prime == n mod a(n-1), a(n)&gt;a(n-1).
 * @author Sean A. Irvine
 */
public class A087523 extends Sequence0 {

  private Z mA = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      Z t = mA.add(mN);
      while (!t.isProbablePrime()) {
        t = t.add(mA);
      }
      mA = t;
    }
    return mA;
  }
}
