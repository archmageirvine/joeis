package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057690 Length of cycle in trajectory of P under the 'Px+1' map, where P = n-th prime, or -1 if trajectory does not cycle.
 * @author Sean A. Irvine
 */
public class A057690 extends A000040 {

  {
    setOffset(2);
    super.next(); // skip 2
  }

  private Z step(final Z p, final Z x) {
    for (Z q = Z.TWO; q.compareTo(p) < 0; q = mPrime.nextPrime(q)) {
      final Z[] qr = x.divideAndRemainder(q);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
    return x.multiply(p).add(1);
  }

  protected long select(final long cnt, final long seen) {
    return cnt;
  }

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = p;
    final TreeSet<Z> seen = new TreeSet<>();
    while (seen.add(x)) {
      x = step(p, x);
    }
    // Cycle detected, now count the length
    final Z y = x;
    long cnt = 0;
    do {
      ++cnt;
      x = step(p, x);
    } while (!x.equals(y));
    return Z.valueOf(select(cnt, seen.size()));
  }
}
