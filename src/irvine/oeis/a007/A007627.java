package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007627 Primitive modest numbers.
 * @author Sean A. Irvine
 */
public class A007627 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long t = 10; t <= mN; t *= 10) {
        final long a = mN / t;
        final long b = mN % t;
        if (b > a && mN % b == a && LongUtils.gcd(a, b) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

