package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067833 Primes p such that sigma(p-4) &gt; p.
 * @author Sean A. Irvine
 */
public class A067833 extends Sequence1 {

  private final Sequence mPrimes = new A000040().skip(2);

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (Functions.SIGMA1.z(p.subtract(4)).compareTo(p) > 0) {
        return p;
      }
    }
  }
}
