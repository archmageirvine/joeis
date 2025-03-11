package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A075822 Perfect powers ordered with their last two digits (leading zeros omitted).
 * @author Sean A. Irvine
 */
public class A075822 extends Sequence1 {

  private final Z[] mFirst = new Z[100];
  private final Sequence mPP = new A001597().skip(4);
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= 100) {
        return null;
      }
      if ((mN & 3) == 2) {
        continue;
      }
      final int r = mN % 25;
      if (r == 5 || r == 10 || r == 15 || r == 20) {
        continue;
      }
      while (mFirst[mN] == null) {
        final Z power = mPP.next();
        final int res = (int) power.mod(100);
        if (mFirst[res] == null) {
          mFirst[res] = power;
        }
      }
      return mFirst[mN];
    }
  }
}
