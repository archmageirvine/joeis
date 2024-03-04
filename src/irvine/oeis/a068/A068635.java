package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A068635 Smaller of the first twin pair to yield a twin pair chain of length n.
 * @author Sean A. Irvine
 */
public class A068635 extends A001359 {

  private int mN = 0;
  private int mL = 0;
  private Z mStart = null;

  @Override
  public Z next() {
    ++mN;
    while (mL < mN) {
      mL = 1;
      mStart = super.next();
      Z p = mStart;
      while (true) {
        Z s = p.multiply2().add(2);
        p = s.subtract(1);
        if (!p.isProbablePrime() || !s.add(1).isProbablePrime()) {
          break;
        }
        ++mL;
      }
    }
    return mStart;
  }
}
