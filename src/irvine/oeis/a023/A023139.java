package irvine.oeis.a023;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023139 Number of cycles of function f(x) = 7x mod n.
 * @author Sean A. Irvine
 */
public class A023139 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m % 7 == 0) {
      m /= 7;
    }
    final long ord = new IntegersMod(m).ord(Z.SEVEN).longValueExact();
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long j = 0; j < ord; ++j, t = t.multiply(7)) {
      sum = sum.add(t.subtract(1).gcd(Z.valueOf(m)));
    }
    return sum.divide(ord);
  }
}

