package irvine.oeis.a290;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A290495 The number of self-inverse Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A290495 extends Sequence0 {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = 1 << mN;
    final Z f = Functions.FACTORIAL.z(m);
    final int lim = (1 << mN) >>> 1;
    for (int k = 0; k <= lim; ++k) {
      sum = sum.add(f.shiftRight(k).divide(Functions.FACTORIAL.z(k)).divide(Functions.FACTORIAL.z(m - 2 * k)));
    }
    return sum;
  }
}
