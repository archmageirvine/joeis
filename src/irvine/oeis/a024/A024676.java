package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A024676 Prime divisors (not necessarily distinct) of n-th term of sequence A024675 (averages of two consecutive odd primes).
 * @author Sean A. Irvine
 */
public class A024676 extends A024675 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
