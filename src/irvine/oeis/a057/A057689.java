package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057689 Maximal term in trajectory of P under the 'Px+1' map, where P = n-th prime, or -1 if no such term exists.
 * @author Sean A. Irvine
 */
public class A057689 extends A000040 {

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

  @Override
  public Z next() {
    final Z p = super.next();
    Z max = Z.NEG_ONE;
    Z x = p;
    final TreeSet<Z> seen = new TreeSet<>();
    while (seen.add(x)) {
      max = max.max(x);
      x = step(p, x);
    }
    return max;
  }
}
