package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000073;

/**
 * A366782 Number of divisors of A000073(n) (tribonacci numbers).
 * @author Sean A. Irvine
 */
public class A366782 extends A000073 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
