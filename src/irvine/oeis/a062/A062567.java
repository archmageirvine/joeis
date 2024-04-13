package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062567 First multiple of n whose reverse is also divisible by n, or 0 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A062567 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    Z m = n;
    while (!Functions.REVERSE.z(m).mod(n).isZero()) {
      m = m.add(n);
    }
    return m;
  }
}

