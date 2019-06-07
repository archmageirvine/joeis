package irvine.oeis.a023;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023138 Number of cycles of function <code>f(x) = 6x mod n</code>.
 * @author Sean A. Irvine
 */
public class A023138 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while ((m & 1) == 0) {
      m >>= 1;
    }
    while (m % 3 == 0) {
      m /= 3;
    }
    final long ord = new IntegersMod(m).ord(Z.SIX).longValueExact();
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long j = 0; j < ord; ++j, t = t.multiply(6)) {
      sum = sum.add(t.subtract(1).gcd(Z.valueOf(m)));
    }
    return sum.divide(ord);
  }
}

