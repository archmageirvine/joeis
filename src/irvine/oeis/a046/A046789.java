package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000230;

/**
 * A046789 Lower prime of the second gap of 2n between primes.
 * @author Sean A. Irvine
 */
public class A046789 extends A000230 {

  /** Construct the sequence. */
  public A046789() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z p1 = super.next();
    // Search for second gap of required size
    Z p3 = mPrime.nextPrime(p1);
    while (true) {
      final Z p4 = mPrime.nextPrime(p3);
      if (p4.subtract(p3).intValueExact() == mGapSize) {
        return p3;
      }
      p3 = p4;
    }
  }
}
