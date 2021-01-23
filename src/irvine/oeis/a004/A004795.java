package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004795 Least positive unitary linear combination of distinct numbers in row n of Pascal's triangle; i.e., least positive sum of form d(0)C(n-1,0) + d(1)C(n-1,1) + ...+ d(m)C(n-1,m), d(i)=+-1, m = floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A004795 implements Sequence {

  private int mN = 0;
  private Z mBest = null;

  private void search(final Z[] terms, final int m, final Z sum) {
    if (m < 0) {
      if (sum.signum() > 0 && sum.compareTo(mBest) < 0) {
        mBest = sum;
      }
      return;
    }
    search(terms, m - 1, sum.add(terms[m]));
    search(terms, m - 1, sum.subtract(terms[m]));
  }

  private Z[] terms(final int n) {
    final Z[] terms = new Z[(n + 1) / 2];
    for (int k = 0; k < terms.length; ++k) {
      terms[k] = Binomial.binomial(n - 1, k);
    }
    return terms;
  }

  @Override
  public Z next() {
    final Z[] terms = terms(++mN);
    mBest = Z.ONE.shiftLeft(mN);
    search(terms, terms.length - 1, Z.ZERO);
    return mBest;
  }
}
