package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A023516 Number of distinct prime divisors of prime(n)*prime(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A023516 extends A023515 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
