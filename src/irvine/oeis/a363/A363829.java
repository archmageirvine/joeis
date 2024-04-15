package irvine.oeis.a363;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A363829 Sum of the divisors of A000129(n) (Pell numbers).
 * @author Sean A. Irvine
 */
public class A363829 extends A000129 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next());
  }
}
