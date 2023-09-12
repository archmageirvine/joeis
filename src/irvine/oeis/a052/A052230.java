package irvine.oeis.a052;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a031.A031924;
import irvine.oeis.memory.MemorySequence;

/**
 * A052230 Primes p from A031924 such that A052180(primepi(p)) = 5.
 * @author Sean A. Irvine
 */
public class A052230 extends A031924 {

  private final MemorySequence mA052180 = MemorySequence.cachedSequence(new A052180()); // offset 2

  protected Z target() {
    return Z.FIVE;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int pi = (int) Puma.primePi(p.intValueExact());
      if (mA052180.a(pi - 2).equals(target())) {
        return p;
      }
    }
  }
}
