package irvine.oeis.a390;

import java.util.HashMap;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390812 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A390812 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    final HashMap<Q, Long> m = new HashMap<>();
    long j = 0;
    for (Z q = Z.TWO; !q.equals(p); q = mPrime.nextPrime(q)) {
      m.merge(new Q(mP.subtract(q), mN - ++j), 1L, Long::sum);
    }
    Z sum = Z.ZERO;
    for (final long v : m.values()) {
      sum = sum.add(v * (v - 1) / 2);
    }
    return sum;
  }
}

