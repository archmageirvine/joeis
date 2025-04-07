package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076496.
 * @author Sean A. Irvine
 */
public class A381974 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z sum = Z.ZERO;
      long t = 1;
      while (t <= mN) {
        sum = sum.add(mN / t);
        t *= 3;
      }
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
  }
}
