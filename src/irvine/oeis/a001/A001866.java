package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001866 Number of connected graphs with n nodes and n edges.
 * @author Sean A. Irvine
 */
public class A001866 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    Z m = Z.valueOf(mN);
    final Z f = Functions.FACTORIAL.z(mN).square().multiply(m.pow(mN - 1)).divide2();
    for (int k = 2; k <= mN; ++k) {
      m = m.multiply(mN);
      s = s.add(f.divide(m).divide(Functions.FACTORIAL.z(mN - k)));
    }
    return s;
  }
}
