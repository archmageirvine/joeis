package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000197 a(n) = (n!)!.
 * @author Sean A. Irvine
 */
public class A000197 extends Sequence0 {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    return mF.factorial(mF.factorial(++mN));
  }
}

