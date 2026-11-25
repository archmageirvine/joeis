package irvine.oeis.a346;

import irvine.math.group.LinearGroupOrder;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A346381 Number of invertible binary matrices with a given dimension of the fixed space.
 * @author Gregory Morse
 */
public class A346381 extends Sequence0 {

  private final int mQ;
  private int mN = -1;
  private int mK = 0;
  private Z[] mRow = new Z[0];

  protected A346381(final int q) {
    mQ = q;
  }

  /** Construct the sequence. */
  public A346381() {
    this(2);
  }

  @Override
  public Z next() {
    if (mK == mRow.length) {
      mRow = new Z[++mN + 1];
      mK = 0;
      final Z q = Z.valueOf(mQ);
      final Z total = LinearGroupOrder.general(mN, q);
      for (int k = mN; k >= 0; --k) {
        // Count the pairs of a matrix and a k-subspace fixed pointwise.
        Z count = total.divide(LinearGroupOrder.general(k, q));
        for (int j = k + 1; j <= mN; ++j) {
          count = count.subtract(mRow[j].multiply(Binomial.gaussianBinomial(j, k, mQ)));
        }
        mRow[k] = count;
      }
    }
    return mRow[mK++];
  }
}
