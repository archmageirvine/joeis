package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069873 Smallest concatenation of powers of 2 in ascending order that is a multiple of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069873 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 5 == 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    Z mA = Z.ONE;
    while (true) {
      sb.append(mA);
      final Z t = new Z(sb);
      if (t.mod(mN) == 0) {
        return t;
      }
      mA = mA.multiply(2);
    }
  }
}

