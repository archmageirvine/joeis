package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035000 Nontrivial trinomial coefficients.
 * @author Sean A. Irvine
 */
public class A035000 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1);
  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }
  private Polynomial<Z> mRow = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    while (mPriority.isEmpty() || mRow.coeff(2).compareTo(mPriority.first()) <= 0) {
      for (int k = 2; k <= mN; ++k) {
        mPriority.add(mRow.coeff(k));
      }
      mRow = RING.pow(C, ++mN);
    }
    return mPriority.pollFirst();
  }
}
