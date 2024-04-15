package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067830 Primes p such that sigma(p-4) &lt; p.
 * @author Sean A. Irvine
 */
public class A067830 extends Sequence1 {

  private final Sequence mPrimes = new A000040().skip(2);

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (Functions.SIGMA.z(p.subtract(4)).compareTo(p) < 0) {
        return p;
      }
    }
  }
}
