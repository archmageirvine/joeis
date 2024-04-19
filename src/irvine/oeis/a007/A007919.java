package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007919 Smallest k such that k*n is a double factorial.
 * @author Sean A. Irvine
 */
public class A007919 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int m = 0;
    while (true) {
      final int n = ++m;
      final Z df = Functions.MULTIFACTORIAL.z(n);
      if (df.mod(mN) == 0) {
        return df.divide(mN);
      }
    }
  }
}
