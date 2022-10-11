package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059789 Distance of 2*Prime[n] from previous prime.
 * @author Sean A. Irvine
 */
public class A059789 extends A000040 {

  @Override
  public Z next() {
    final Z t = super.next().multiply2();
    return t.subtract(mPrime.prevPrime(t));
  }
}
