package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064011 Sum of distinct primes dividing n! + 1.
 * @author Sean A. Irvine
 */
public class A064011 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.SOPF.z(super.next().add(1));
  }
}
