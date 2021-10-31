package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a031.A031924;

/**
 * A052230 Primes p from A031924 such that A052180(primepi(p)) = 5.
 * @author Sean A. Irvine
 */
public class A052230 extends A031924 {

  private final MemorySequence mA052180 = MemorySequence.cachedSequence(new A052180()); // offset 2
  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720()); // offset 1

  protected Z target() {
    return Z.FIVE;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int pi = mPrimePi.a(p.intValueExact() - 1).intValueExact();
      if (mA052180.a(pi - 2).equals(target())) {
        return p;
      }
    }
  }
}
