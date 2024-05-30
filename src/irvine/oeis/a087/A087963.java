package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A087963 Exponent of highest power of 2 dividing 3*prime(n)+1.
 * @author Georg Fischer
 */
public class A087963 extends A000040 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next().multiply(3).add(1), Z.TWO);
  }
}
