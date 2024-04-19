package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001514 Bessel polynomial {y_n}'(1).
 * @author Sean A. Irvine
 */
public class A001514 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -2;

  private Z t(final int n, final int m) {
    return Functions.FACTORIAL.z(n + m + 2)
      .shiftRight(m)
      .divide(Functions.FACTORIAL.z(m))
      .divide(Functions.FACTORIAL.z(n - m));
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(t(mN, k));
    }
    return s.divide2();
  }
}
