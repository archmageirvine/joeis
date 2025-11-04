package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002808;

/**
 * A081546 Smallest prime which is 1 more than the product of n (not necessarily distinct) composite numbers.
 * @author Sean A. Irvine
 */
public class A081546 extends Sequence0 {

  private final DirectSequence mComposites = DirectSequence.create(new A002808());
  private int mN = -1;
  private Z mBest = null;

  private void search(final Z prod, final int remaining, final int pos) {
    if (remaining == 0) {
      if (prod.add(1).isProbablePrime()) {
        mBest = prod;
      }
      return;
    }
    int k = pos;
    while (true) {
      final Z c = mComposites.a(k);
      if (mBest != null) {
        final Z v = prod.multiply(mComposites.a(k).pow(remaining));
        if (v.compareTo(mBest) >= 0) {
          break;
        }
      }
      search(prod.multiply(c), remaining - 1, k);
      ++k;
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    mBest = null;
    search(Z.ONE, mN, 0);
    return mBest.add(1);
  }
}
