package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A067109 Number of occurrences of the string n in n! (A000142).
 * @author Sean A. Irvine
 */
public class A067109 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    Z f = mF.next();
    long cnt = 0;
    while (!f.isZero()) {
      if (f.mod(mMod) == mN) {
        ++cnt;
      }
      f = f.divide(10);
    }
    return Z.valueOf(cnt);
  }
}
