package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002808;

/**
 * A081545 Smallest prime which is 1 more than the product of n distinct composite numbers.
 * @author Sean A. Irvine
 */
public class A081545 extends Sequence0 {

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
      final Z pr = prod.multiply(c);
      if (mBest != null) {
        // Construct a weak lower bound on what the final product will be, but
        // assuming all remaining factors are the next composite
        final Z v = pr.multiply(mComposites.a(k + 1).pow(remaining - 1));
        if (v.compareTo(mBest) >= 0) {
          break;
        }
      }
      search(pr, remaining - 1, k + 1);
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
