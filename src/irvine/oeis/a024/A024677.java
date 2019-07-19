package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A024677 Smallest prime divisor of n-th terms of sequence <code>A024675</code> (averages of two consecutive odd primes).
 * @author Sean A. Irvine
 */
public class A024677 extends A024675 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).toZArray()[0];
  }
}
