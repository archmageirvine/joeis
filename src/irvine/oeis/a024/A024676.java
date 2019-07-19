package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A024676 Prime divisors (not necessarily distinct) of n-th term of sequence <code>A024675</code> (averages of two consecutive odd primes).
 * @author Sean A. Irvine
 */
public class A024676 extends A024675 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next()).bigOmega());
  }
}
