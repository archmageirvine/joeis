package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004018;

/**
 * A002611 Glaisher's function V(n).
 * @author Sean A. Irvine
 */
public class A002611 implements Sequence {

  private final Sequence mTheta = new A002288();
  private final ArrayList<Z> mThetaSeq = new ArrayList<>();
  private final Sequence mE = new A004018();
  private final ArrayList<Z> mESeq = new ArrayList<>();
  private int mN = 0;

  private Z bigTheta(final int n) {
    while (n >= mThetaSeq.size()) {
      mThetaSeq.add(mTheta.next());
    }
    return mThetaSeq.get(n);
  }

  private Z bigE(final int n) {
    while (n >= mESeq.size()) {
      mESeq.add(mE.next());
    }
    return mESeq.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; 2 * k <= mN; ++k) {
      sum = sum.add(bigE(mN - 2 * k).multiply(bigTheta(k)));
    }
    return sum;
  }
}
