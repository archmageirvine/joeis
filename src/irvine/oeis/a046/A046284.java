package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a019.A019518;

/**
 * A046284 Primes p such that concatenation of primes from 2 through p is a prime.
 * @author Sean A. Irvine
 */
public class A046284 extends A019518 {

  private final Sequence mPrimes = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (super.next().isProbablePrime()) {
        return p;
      }
    }
  }
}
