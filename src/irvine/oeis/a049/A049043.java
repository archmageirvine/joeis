package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a003.A003422;

/**
 * A049043 Primes not in domain of A049041.
 * @author Sean A. Irvine
 */
public class A049043 extends A000040 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A003422());

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z pp = super.next();
      final int p = pp.intValueExact();
      for (int k = 2; k <= p; ++k) {
        if (mA.a(k).mod(p) == 0) {
          continue outer;
        }
      }
      return pp;
    }
  }
}
