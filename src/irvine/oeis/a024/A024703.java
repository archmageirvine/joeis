package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A024703 Prime divisors, including repetitions, of n-th term of A024702.
 * @author Sean A. Irvine
 */
public class A024703 extends A024702 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
