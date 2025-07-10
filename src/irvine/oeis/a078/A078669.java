package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036740;

/**
 * A078669 Number of times n appears among the decimal digits of (n!)^n.
 * @author Sean A. Irvine
 */
public class A078669 extends Sequence1 {

  private final Sequence mA = new A036740().skip();
  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    Z t = mA.next();
    long cnt = 0;
    while (!t.isZero()) {
      if (t.mod(mMod) == mN) {
        ++cnt;
      }
      t = t.divide(10);
    }
    return Z.valueOf(cnt);
  }
}
