package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050517 Value of phi in arithmetic progression of at least 5 terms having the same value of phi in A050515.
 * @author Sean A. Irvine
 */
public class A050517 implements Sequence {

  private Z mN = Z.valueOf(353639);
  private Z mPhi = null;
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      mN = mN.add(1);
      mPhi = Euler.phi(mN);
      final TreeSet<Z> set = Euler.inversePhi(mPhi);
      while (!set.first().equals(mN)) {
        set.pollFirst();
      }
      set.pollFirst(); // remove mN itself
      while (set.size() >= 4) {
        final Z d = set.pollFirst().subtract(mN);
        if (set.contains(mN.add(d.multiply2())) && set.contains(mN.add(d.multiply(3))) && set.contains(mN.add(d.multiply(4)))) {
          ++mM; // Found an AP-4 starting with mN
        }
      }
    }
    --mM;
    return mPhi;
  }
}
