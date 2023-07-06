package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A065133 Remainder when n-th prime is divided by the number of primes not exceeding n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A065133 extends A065091 {

  {
    setOffset(2);
  }

  private final Sequence mPrimePi = new A000720().skip(1);

  @Override
  public Z next() {
    return super.next().mod(mPrimePi.next());
  }
}
