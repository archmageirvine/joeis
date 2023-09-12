package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065657.
 * @author Sean A. Irvine
 */
public class A065759 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      long v = 0;
      long w = 1;
      long s = 0;
      while (u != 0 && s <= mN) {
        v += w * (u % 10);
        w *= 10;
        u /= 10;
        s += u * v;
      }
      if (mN == s) {
        return Z.valueOf(mN);
      }
    }
  }
}
