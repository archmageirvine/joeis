package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A083520 Primes p such that p-1 is a product of two or more consecutive integers. Or (p-1) is a permutation of m items chosen from n, for some m and n. p-1 = k*(k+1)(k+2)...(k+r) for some k and r, r&gt;0.
 * @author Sean A. Irvine
 */
public class A083520 extends Sequence1 {

  private final DynamicArray<Z> mProducts = new DynamicArray<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN.square()) >= 0) {
      mN = mN.add(1);
      for (int k = 0; k < mProducts.length(); ++k) {
        final Z t = mProducts.get(k).multiply(mN);
        mProducts.set(k, t);
        if (t.add(1).isProbablePrime()) {
          mA.add(t);
        }
      }
      mProducts.set(mProducts.length(), mN);
    }
    return mA.pollFirst().add(1);
  }
}
