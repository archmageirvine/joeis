package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000166;
import irvine.math.z.Binomial;

import java.util.ArrayList;

/**
 * A002628 Number of permutations of length n without <code>3-sequences</code>.
 * @author Sean A. Irvine
 */
public class A002628 implements Sequence {

  private final A000166 mD = new A000166();
  private final ArrayList<Z> mDSeq = new ArrayList<>();
  private int mN = 0;

  private Z d(final int n) {
    while (n >= mDSeq.size()) {
      mDSeq.add(mD.next());
    }
    return mDSeq.get(n);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k).multiply(d(mN - k).add(d(mN - k - 1))));
    }
    return sum;
  }
}
