package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000197;

/**
 * A078670 Number of times n appears among the decimal digits of (n!)!.
 * @author Sean A. Irvine
 */
public class A078670 extends Sequence1 {

  private final Sequence mA = new A000197().skip();
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
