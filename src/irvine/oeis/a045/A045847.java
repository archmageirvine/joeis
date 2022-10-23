package irvine.oeis.a045;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045847 Matrix whose (i,j)-th entry is number of representations of j as a sum of i squares of nonnegative integers; read by diagonals.
 * @author Sean A. Irvine
 */
public class A045847 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final ArrayList<Polynomial<Z>> mRows = new ArrayList<>();
  {
    mRows.add(RING.one());  // S^0
    mRows.add(RING.one());  // S^1
  }
  private int mR = 1;
  private int mS = 1;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      // Moving to another diagonal
      if (++mN == mS) {
        // Another square needs to be accounted for
        final Polynomial<Z> s = RING.add(mRows.get(1), RING.monomial(Z.ONE, mS));
        mRows.set(1, s);
        mS = ++mR * mR; // update limit to next square
        // update existing powers with sufficient coefficient to the next square
        for (int k = 2; k < mRows.size(); ++k) {
          mRows.set(k, RING.multiply(mRows.get(k - 1), s, mS - 1));
        }
      }
      // Start a new row
      if (mN >= mRows.size()) {
        mRows.add(RING.multiply(mRows.get(mN - 1), mRows.get(1), mS - 1));
      }
      mM = 0;
    }
    return mRows.get(mN - mM).coeff(mM);
  }
}
