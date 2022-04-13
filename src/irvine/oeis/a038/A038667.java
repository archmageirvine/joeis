package irvine.oeis.a038;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038667 Minimal value of |product(A) - product(B)| where A and B are a partition of {1,2,3,...,n}.
 * @author Sean A. Irvine
 */
public class A038667 implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private Z mP;

  private Z g(final Z m, final int j, final Z b) {
    if (j == 1) {
      return m;
    }
    Z mm = m;
    Z bb = b;
    for (int k = 1; k <= 2 && mm.compareTo(mP) < 0; ++k) {
      if (j == 2 || k == 2 || mF.factorial(j - 1).multiply(mm).compareTo(bb) > 0) {
        bb = bb.max(g(mm, j - 1, bb));
      }
      mm = mm.multiply(j);
    }
    return bb;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mP = mF.factorial(mN).sqrt().add(1);
    final Z gg = g(Z.ONE, mN, Z.ONE);
    return mF.factorial(mN).divide(gg).subtract(gg);
  }
}
