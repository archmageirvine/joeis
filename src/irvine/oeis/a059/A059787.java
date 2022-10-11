package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059787 Distance between 2*(n-th prime) and next prime.
 * @author Sean A. Irvine
 */
public class A059787 extends A000040 {

  @Override
  public Z next() {
    final Z t = super.next().multiply2();
    return mPrime.nextPrime(t).subtract(t);
  }
}
