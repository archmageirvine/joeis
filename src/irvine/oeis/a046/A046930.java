package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046930 Size of sea of composite numbers surrounding n-th prime.
 * @author Sean A. Irvine
 */
public class A046930 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(mPrime.prevPrime(p)).subtract(2);
  }
}

