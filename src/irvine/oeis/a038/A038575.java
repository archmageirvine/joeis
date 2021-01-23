package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A038575 Number of prime factors of n-th Fibonacci number, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A038575 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
