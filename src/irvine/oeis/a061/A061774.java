package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061774 extends A000961 {

  @Override
  public Z next() {
    return MemoryFactorial.SINGLETON.factorial(super.next().intValueExact() - 1);
  }
}
