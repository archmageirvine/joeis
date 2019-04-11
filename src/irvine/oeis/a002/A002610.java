package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A002610 Glaisher's function H'(4n+1) <code>(18</code> squares version).
 * @author Sean A. Irvine
 */
public class A002610 extends MemorySequence {

  private final Sequence mTheta = new A002288();
  private final ArrayList<Z> mThetaSeq = new ArrayList<>();

  private Z bigTheta(final int n) {
    while (n >= mThetaSeq.size()) {
      mThetaSeq.add(mTheta.next());
    }
    return mThetaSeq.get(n);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = 4 * n + 1;
    Z sum = Z.ZERO;
    boolean sign = true;
    for (int k = 1, j = 0; n - j >= 0; k += 2, j += k - 1, sign = !sign) {
      final Z h = bigTheta(n - j).multiply(k);
      sum = sum.signedAdd(sign, h);
    }
    for (int k = 2; m - k * k >= 0; k += 2) {
      final int c = m - k * k;
      sum = sum.signedAdd((k & 2) != 0, get(c / 4).multiply(k == 0 ? 1 : 2));
    }
    return sum;
  }
}
