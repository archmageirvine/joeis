package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A048252 Largest number whose sum of divisors is 6^n.
 * @author Sean A. Irvine
 */
public class A048252 extends A048251 {

  private int mN = -1;
  private Z mBest = Z.ZERO;

  private void search(final Z product, final int a, final int b, final int pos) {
    if (a == 0 && b == 0) {
      if (product.compareTo(mBest) > 0) {
        mBest = product;
      }
      return;
    }
    int k = pos;
    while (true) {
      final Z p = mS.a(k);
      final Pair<Integer, Integer> pair = get(p);
      final int twos = pair.left();
      final int threes = pair.right();
      if (twos <= a && threes <= b) {
        final Z u = product.multiply(p);
        search(u, a - twos, b - threes, k + 1);
      } else if (twos > a && threes > b) {
        return;
      }
      ++k;
    }
  }

  @Override
  public Z next() {
    mBest = Z.ZERO;
    search(Z.ONE, ++mN, mN, 0);
    return mBest;
  }
}
