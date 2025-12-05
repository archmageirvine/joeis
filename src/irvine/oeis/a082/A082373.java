package irvine.oeis.a082;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082373 Table with 4 consecutive primes prime(k), prime(k+1), prime(k+2) and prime(k+3) in a row such that prime(k)^x + prime(k+1)^x == prime(k+2) (mod prime(k+3)) has no solution x.
 * @author Sean A. Irvine
 */
public class A082373 extends A000040 {

  private final LinkedList<Z> mA = new LinkedList<>();

  private void check(final Z p) {
    final Z q = mPrime.nextPrime(p);
    final Z r = mPrime.nextPrime(q);
    final Z s = mPrime.nextPrime(r);
    final long sl = s.longValueExact();
    for (long k = 0; k < sl; ++k) {
      if (p.modPow(k, s).add(q.modPow(k, s)).subtract(r).mod(s).isZero()) {
        return;
      }
    }
    // Solution found
    mA.add(p);
    mA.add(q);
    mA.add(r);
    mA.add(s);
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      check(super.next());
    }
    return mA.pollFirst();
  }
}
