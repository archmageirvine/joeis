package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052080 Concatenation of n consecutive descending numbers starting from a(n) produces the smallest possible prime of this form, 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A052080 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    } else if (mN == 1) {
      return Z.TWO; // so we can use +2 on start
    }
    long start = mN;
    while (true) {
      start += 2;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, j = start; k < mN; ++k, --j) {
        sb.append(j);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return Z.valueOf(start);
      }
    }
  }
}

