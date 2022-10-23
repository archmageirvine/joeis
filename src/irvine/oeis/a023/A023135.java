package irvine.oeis.a023;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023135 Number of cycles of function f(x) = 3x mod n.
 * @author Sean A. Irvine
 */
public class A023135 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m % 3 == 0) {
      m /= 3;
    }
    final long ord = new IntegersMod(m).ord(Z.THREE).longValueExact();
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long j = 0; j < ord; ++j, t = t.multiply(3)) {
      sum = sum.add(t.subtract(1).gcd(Z.valueOf(m)));
    }
    return sum.divide(ord);
  }
}

