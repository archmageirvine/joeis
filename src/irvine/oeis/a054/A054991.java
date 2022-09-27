package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a033.A033312;

/**
 * A054991 Number of prime divisors of n! - 1 (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A054991 extends A033312 {

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
