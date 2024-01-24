package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A024676 a(n) is the number of prime divisors (counted by multiplicity) of A024675(n).
 * @author Sean A. Irvine
 */
public class A024676 extends A024675 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
