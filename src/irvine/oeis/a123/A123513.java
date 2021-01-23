package irvine.oeis.a123;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000166;

/**
 * A123513 Triangle read by rows: T(n,k) is the number of permutations of [n] having k small descents (n &gt;= 1; 0 &lt;= k &lt;= n-1). A small descent in a permutation (x_1,x_2,...,x_n) is a position i such that x_i - x_(i+1) = 1.
 * @author Sean A. Irvine
 */
public class A123513 implements Sequence {

  private final Sequence mA = new A000166();
  private final ArrayList<Z> mB = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;

  /**
   * Return a number in this triangle.
   * @param n row
   * @param k column
   * @return value
   */
  public Z t(final int n, final int k) {
    while (mB.size() <= n - k + 1) {
      mB.add(mA.next());
    }
    return Binomial.binomial(n, n - k).multiply(mB.get(n - k + 1)).divide(n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
