package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000051;

/**
 * A054992 Number of prime factors of 2^n + 1 (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A054992 extends A000051 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
