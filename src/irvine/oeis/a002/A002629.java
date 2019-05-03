package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000166;
import irvine.math.z.Binomial;

import java.util.ArrayList;

/**
 * A002629 Number of permutations of length n with one <code>3-sequence</code>.
 * @author Sean A. Irvine
 */
public class A002629 implements Sequence {

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
    for (int k = 1; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - k - 2, k - 1).multiply(d(mN - k)));
    }
    return sum;
  }
}
