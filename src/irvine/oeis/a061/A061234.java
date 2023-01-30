package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061234 Smallest number with prime(n)^2 divisors where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A061234 extends A000040 {

  @Override
  public Z next() {
    return Z.SIX.pow(super.next().subtract(1));
  }
}
