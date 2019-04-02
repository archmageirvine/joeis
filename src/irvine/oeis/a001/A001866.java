package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001866 Number of connected graphs with n nodes and n edges.
 * @author Sean A. Irvine
 */
public class A001866 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    Z m = Z.valueOf(mN);
    final Z f = mF.factorial(mN).square().multiply(m.pow(mN - 1)).divide(2);
    for (int k = 2; k <= mN; ++k) {
      m = m.multiply(mN);
      s = s.add(f.divide(m).divide(mF.factorial(mN - k)));
    }
    return s;
  }
}
