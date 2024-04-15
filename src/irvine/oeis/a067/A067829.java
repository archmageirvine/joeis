package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067829 Primes p such that sigma(p-2) &lt; p.
 * @author Sean A. Irvine
 */
public class A067829 extends Sequence1 {

  private final Sequence mPrimes = new A000040().skip();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (Functions.SIGMA.z(p.subtract(2)).compareTo(p) < 0) {
        return p;
      }
    }
  }
}
