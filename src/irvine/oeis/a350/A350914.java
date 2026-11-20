package irvine.oeis.a350;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A350914 Triangle read by rows: T(n,k) is the number of unlabeled weakly connected oriented graphs with n arcs and k vertices, k = 1..n+1.
 * @author Gregory Morse
 */
public class A350914 extends A350734 {
  private int mN = -1;
  private int mK = 0;
  private Polynomial<Polynomial<Q>> mTable;

  /** Construct the sequence. */
  public A350914() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mK > mN + 1) {
      ++mN;
      mK = 1;
      mTable = counts(mN + 1, mN);
    }
    return mTable.coeff(mK).coeff(mN).toZ();
  }
}
