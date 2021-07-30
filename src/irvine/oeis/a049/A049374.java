package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a030.A030527;

/**
 * A049374 A triangle of numbers related to triangle A030527.
 * @author Sean A. Irvine
 */
public class A049374 extends A030527 {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    return super.next().multiply(mF.factorial(mN)).divide(mF.factorial(mM)).divide(Z.FIVE.pow(mN - mM));
  }
}
