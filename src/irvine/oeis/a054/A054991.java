package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a033.A033312;

/**
 * A054991 Number of prime divisors of n! - 1 (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A054991 extends A033312 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
