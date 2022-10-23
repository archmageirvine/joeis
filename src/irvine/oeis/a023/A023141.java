package irvine.oeis.a023;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023141 Number of cycles of function f(x) = 9x mod n.
 * @author Sean A. Irvine
 */
public class A023141 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m % 3 == 0) {
      m /= 3;
    }
    final long ord = new IntegersMod(m).ord(Z.NINE).longValueExact();
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long j = 0; j < ord; ++j, t = t.multiply(9)) {
      sum = sum.add(t.subtract(1).gcd(Z.valueOf(m)));
    }
    return sum.divide(ord);
  }
}

