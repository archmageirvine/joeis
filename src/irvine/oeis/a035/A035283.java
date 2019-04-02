package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A035283 Expansion of zeta function of ring H(Q(sqrt(2)).
 * @author Sean A. Irvine
 */
public class A035283 implements Sequence {

  private final Sequence mA = new A035185();
  private final ArrayList<Z> mASeq = new ArrayList<>();
  {
    mASeq.add(Z.ZERO);
  }

  private int mN = 0;

  private Z a(final int n) {
    while (mASeq.size() <= n) {
      mASeq.add(mA.next());
    }
    return mASeq.get(n);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z sum = Z.ZERO;
      for (int k = 1; k <= mN; ++k) {
        final int t = mN / k;
        if (t * k == mN) {
          sum = sum.add(a(t).multiply(a(k).multiply(k)));
        }
      }
      if (!Z.ZERO.equals(sum)) {
        return sum;
      }
    }
  }
}
