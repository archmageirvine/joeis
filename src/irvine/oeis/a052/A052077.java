package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052077 Smallest prime formed by concatenating n consecutive increasing numbers, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A052077 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    } else if (mN == 1) {
      return Z.TWO; // so we can use +2 on start
    }
    long start = mN & 1;
    while (true) {
      start += 2;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, j = start; k < mN; ++k, ++j) {
        sb.append(j);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

