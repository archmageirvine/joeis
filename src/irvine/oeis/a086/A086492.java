package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086492 Group the natural numbers such that the n-th group sum is divisible by prime(n): (1, 2, 3), (4, 5), (6, 7, 8, 9), (10, 11), (12, 13, 14, 15, 16, 17, 18, 19, 20, 21), ... Sequence contains (the sum of the terms in the n-th group)/prime(n): a(n) = A086491(n)/prime(n).
 * @author Sean A. Irvine
 */
public class A086492 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    Z v = Z.ZERO;
    do {
      v = v.add(++mN);
    } while (!v.mod(p).isZero());
    return v.divide(p);
  }
}

