package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002802 a(n) = (2*n+3)!/(6*n!*(n+1)!).
 * @author Sean A. Irvine
 */
public class A002802 extends Sequence0 {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(2 * mN + 3)
      .divide(Functions.FACTORIAL.z(mN))
      .divide(Functions.FACTORIAL.z(mN + 1))
      .divide(6);
  }
}

