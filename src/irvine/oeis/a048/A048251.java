package irvine.oeis.a048;

import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a005.A005105;
import irvine.util.Pair;

/**
 * A048251 a(n) is the smallest number whose sum of divisors is 6^n.
 * @author Sean A. Irvine
 */
public class A048251 extends MemoryFunctionSequence<Z, Pair<Integer, Integer>> {

  // We have products of distinct primes, so sigma(n) = product_p (p+1) where p | n.
  // Further p+1 = 2^i * 3*j, so we need only remember (i,j) for each relevant p

  protected final MemorySequence mS = MemorySequence.cachedSequence(new A005105());
  private int mN = -1;
  private Z mBest = null;

  @Override
  protected Pair<Integer, Integer> compute(final Z key) {
    final Z t = key.add(1);
    Z u = t.makeOdd();
    int threes = 0;
    while (!Z.ONE.equals(u)) {
      ++threes;
      u = u.divide(3);
    }
    //System.out.println(key + " -> (" + t.auxiliary() + "," + threes + ")");
    return new Pair<>((int) t.auxiliary(), threes);
  }

  private void search(final Z product, final int a, final int b, final int pos) {
    if (a == 0 && b == 0) {
      if (mBest == null || product.compareTo(mBest) < 0) {
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
        if (mBest != null && u.compareTo(mBest) > 0) {
          return;
        }
        search(u, a - twos, b - threes, k + 1);
      } else if (twos > a && threes > b) {
        return;
      }
      ++k;
    }
  }

  @Override
  public Z next() {
    mBest = null;
    search(Z.ONE, ++mN, mN, 0);
    return mBest;
  }
}
