package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081547 Smallest composite number which is 1 more than the product of n (not necessarily distinct) prime numbers.
 * @author Sean A. Irvine
 */
public class A081547 extends Sequence1 {

  private int mN = 0;
  private Z mBest = null;

  private void search(final Z prod, final int remaining, final int pos) {
    if (remaining == 0) {
      if (!prod.add(1).isProbablePrime()) {
        mBest = prod;
      }
      return;
    }
    int k = pos;
    while (true) {
      final Z p = Functions.PRIME.z(k);
      if (mBest != null) {
        final Z v = prod.multiply(Functions.PRIME.z(k).pow(remaining));
        if (v.compareTo(mBest) >= 0) {
          break;
        }
      }
      search(prod.multiply(p), remaining - 1, k);
      ++k;
    }
  }

  @Override
  public Z next() {
    mBest = null;
    search(Z.ONE, ++mN, 1);
    return mBest.add(1);
  }
}
