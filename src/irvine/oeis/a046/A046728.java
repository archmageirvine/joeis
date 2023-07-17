package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000230;

/**
 * A046728 Let p1, p2 be first pair of consecutive primes with difference 2n; let p3, p4 be 2nd such pair; sequence gives "wadi" value p3-p1.
 * @author Sean A. Irvine
 */
public class A046728 extends A000230 {

  /** Construct the sequence. */
  public A046728() {
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
        return p3.subtract(p1);
      }
      p3 = p4;
    }
  }
}
