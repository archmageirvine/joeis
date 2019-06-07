package irvine.oeis.a023;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023136 Number of cycles of function <code>f(x) = 4x mod n</code>.
 * @author Sean A. Irvine
 */
public class A023136 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while ((m & 1) == 0) {
      m >>= 1;
    }
    final long ord = new IntegersMod(m).ord(Z.FOUR).longValueExact();
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long j = 0; j < ord; ++j, t = t.multiply(4)) {
      sum = sum.add(t.subtract(1).gcd(Z.valueOf(m)));
    }
    return sum.divide(ord);
  }
}

