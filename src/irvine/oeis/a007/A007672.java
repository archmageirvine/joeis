package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A007672.
 * @author Sean A. Irvine
 */
public class A007672 extends A002034 {

  private long mN = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    return mF.factorial(super.next().intValueExact()).divide(++mN);
  }
}
