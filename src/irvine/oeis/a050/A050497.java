package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050497 Values of phi(x) in arithmetic progressions of at least 4 terms having the same value of phi(x) in A050495.
 * @author Sean A. Irvine
 */
public class A050497 extends Sequence1 {

  private Z mN = Z.valueOf(71);
  private Z mPhi = null;
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      mN = mN.add(1);
      mPhi = Functions.PHI.z(mN);
      final TreeSet<Z> set = InverseEuler.inversePhi(mPhi);
      while (!set.first().equals(mN)) {
        set.pollFirst();
      }
      set.pollFirst(); // remove mN itself
      while (set.size() >= 3) {
        final Z d = set.pollFirst().subtract(mN);
        if (set.contains(mN.add(d.multiply2())) && set.contains(mN.add(d.multiply(3)))) {
          ++mM; // Found an AP-4 starting with mN
        }
      }
    }
    --mM;
    return mPhi;
  }
}
