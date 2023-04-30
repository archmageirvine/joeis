package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000142;

/**
 * A063499 Primes of the form prime(n) + n!.
 * @author Sean A. Irvine
 */
public class A063499 extends Sequence1 {

  private final Sequence mPrimes = new A000040();
  private final Sequence mFactorials = new A000142();
  {
    mFactorials.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrimes.next().add(mFactorials.next());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
