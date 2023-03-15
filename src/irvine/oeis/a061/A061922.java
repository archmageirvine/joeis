package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061922 Xcatalans - produced as a self-convolved sequence like Catalan numbers (A000108) but use carryless GF(2)[ X ] polynomial multiplication.
 * @author Sean A. Irvine
 */
public class A061922 extends Sequence0 {

  private final List<Z> mCatalans = new ArrayList<>();

  private Z multiply(final Z a, final Z b) {
    Z sum = Z.ZERO;
    for (Z s = b, t = a; !s.isZero(); s = s.divide2(), t = t.multiply2()) {
      if (s.testBit(0)) {
        sum = sum.xor(t);
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (mCatalans.isEmpty()) {
      mCatalans.add(Z.ONE);
    } else {
      Z sum = Z.ZERO;
      for (int k = 0; k < mCatalans.size(); ++k) {
        sum = sum.add(multiply(mCatalans.get(k), mCatalans.get(mCatalans.size() - k - 1)));
      }
      mCatalans.add(sum);
    }
    return mCatalans.get(mCatalans.size() - 1);
  }
}
