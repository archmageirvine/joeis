package irvine.oeis.a088;
// manually 2021-09-27

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A088855 Triangle read by rows: number of symmetric Dyck paths of semilength n with k peaks. 
 * @author Georg Fischer
 */
public class A088855 extends Sequence1 {

  protected long mN;
  protected long mK;

  /** Construct the sequence. */
  public A088855() {
    mN = 0; // offset 1
    mK = 0;
  }

  /**
   * Compute a triangle element.
   * This method is used in A157052 and A247644.
   * @param n row index
   * @param k column index
   * @return T(n, k)
   */
  public static Z element(final long n, final long k) {
    return Binomial.binomial((n - 1) >> 1, (k - 1) >> 1).multiply(Binomial.binomial(n >> 1, k >> 1));
  }

  @Override
  public Z next() {
    ++mK;
    if (mK > mN) {
      ++mN;
      mK = 1;
    }
    return element(mN, mK);
  }
}
