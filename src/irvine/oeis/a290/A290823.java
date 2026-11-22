package irvine.oeis.a290;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A290823 Irregular triangle read by rows: T(n,k) = number of k-irredundant sets in the n X n rook graph.
 * @author Gregory Morse
 */
public class A290823 extends A290818 {
  private int mN = -1;
  private int mK = 0;
  private Polynomial<Z> mRow;

  /** Construct the sequence. */
  public A290823() {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (mRow == null || ++mK > mRow.degree()) {
      ++mN;
      mK = 0;
      mRow = irredundant(mN, mN);
    }
    return mRow.coeff(mK);
  }
}
