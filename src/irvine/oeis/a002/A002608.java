package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002608 Glaisher's function T(2n+1).
 * @author Sean A. Irvine
 */
public class A002608 extends MemorySequence {

  private final A002607 mChi8 = new A002607();
  private final ArrayList<Z> mChi8Seq = new ArrayList<>();
  {
    mChi8Seq.add(Z.ZERO);
  }

  private Z chi8(final int n) {
    while (n >= mChi8Seq.size()) {
      mChi8Seq.add(mChi8.next());
    }
    return mChi8Seq.get(n);
  }

  @Override
  protected Z computeNext() {
    final int n = 2 * size() + 1;
    final int m = 4 * n + 1;
    Z sum = Z.ZERO;
    for (int k = 0; m - k * k >= 0; k += 2) {
      final int c = m - k * k;
      sum = sum.signedAdd((k & 2) == 0, chi8(c).multiply(k == 0 ? 1 : 2));
    }
    boolean sign = false;
    for (int k = 3, j = 2; n - j >= 0; k += 2, j += k - 1, sign = !sign) {
      final Z h = a((n - j) / 2).multiply(k).multiply(32);
      sum = sum.signedAdd(sign, h);
    }
    return sum.divide(-32);
  }
}
