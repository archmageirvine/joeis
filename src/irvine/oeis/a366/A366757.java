package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a033.A033312;

/**
 * A366757 a(n) is the sum of the divisors of n!-1.
 * @author Sean A. Irvine
 */
public class A366757 extends A033312 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
