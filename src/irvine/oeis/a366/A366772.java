package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001045;

/**
 * A366772 Sum of the divisors of A001045(n) (Jacobsthal numbers).
 * @author Sean A. Irvine
 */
public class A366772 extends A001045 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
