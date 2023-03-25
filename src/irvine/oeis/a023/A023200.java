package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023200 Primes p such that p + 4 is also prime.
 * @author Sean A. Irvine
 */
public class A023200 extends A000040 {

  private final long mAdd;

  /** Construct the sequence. */
  public A023200() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param add add this number to the product
   */
  public A023200(final long add) {
    mAdd = add;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.add(mAdd))) {
        return p;
      }
    }
  }
}
