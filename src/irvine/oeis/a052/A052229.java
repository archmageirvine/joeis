package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a031.A031924;
import irvine.oeis.memory.MemorySequence;

/**
 * A052229 a(n) is the first prime p from A031924 such that A052180(primepi(p)) = prime(n).
 * @author Sean A. Irvine
 */
public class A052229 extends A000040 {

  private final MemorySequence mA052180 = MemorySequence.cachedSequence(new A052180()); // offset 2
  {
    setOffset(3);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z targetPrime = super.next();
    final Sequence seq = new A031924();
    while (true) {
      final Z p = seq.next();
      final int pi = Functions.PRIME_PI.i(p);
      if (mA052180.a(pi - 2).equals(targetPrime)) {
        return p;
      }
    }
  }
}
