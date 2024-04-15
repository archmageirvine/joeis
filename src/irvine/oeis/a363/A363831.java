package irvine.oeis.a363;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A363831 Number of divisors of A000129(n) (Pell numbers).
 * @author Sean A. Irvine
 */
public class A363831 extends A000129 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
