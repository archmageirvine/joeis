package irvine.oeis.a052;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051573;

/**
 * A052250 Triangle T(n,k) (n &gt;= 1, k &gt;= 1) giving dimension of bigrading of Hopf algebra of rooted trees.
 * @author Sean A. Irvine
 */
public class A052250 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private final MemorySequence mB = MemorySequence.cachedSequence(new A051573());
  private final Polynomial<Z> mRow = RING.empty();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mRow.clear();
      for (int k = 0; k <= mN; ++k) {
        mRow.add(mB.a(k));
      }
    }
    return RING.pow(mRow, mM, mN - mM).coeff(mN - mM);
  }
}
