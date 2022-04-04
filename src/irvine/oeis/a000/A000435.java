package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000435 Normalized total height of all nodes in all rooted trees with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A000435 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    final Z f = mF.factorial(mN++);
    Z s = Z.ZERO;
    Z n = Z.ONE;
    for (int k = 0; k <= mN - 2; ++k, n = n.multiply(mN)) {
      s = s.add(n.multiply(f.divide(mF.factorial(k))));
    }
    return s;
  }
}
