package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381973 Numbers m such that Sum_{k &gt;= 0} floor(m/3^k) is prime.
 * @author Sean A. Irvine
 */
public class A381973 extends Sequence1 {

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
        return Z.valueOf(mN);
      }
    }
  }
}
