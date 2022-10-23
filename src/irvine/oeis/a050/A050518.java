package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050518 An arithmetic progression of at least 6 terms having the same value of phi starts at these numbers.
 * @author Sean A. Irvine
 */
public class A050518 extends Sequence1 {

  private Z mN = Z.valueOf(583199);
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      mN = mN.add(1);
      final Z phi = Euler.phi(mN);
      final TreeSet<Z> set = Euler.inversePhi(phi);
      while (!set.first().equals(mN)) {
        set.pollFirst();
      }
      set.pollFirst(); // remove mN itself
      while (set.size() >= 5) {
        final Z d = set.pollFirst().subtract(mN);
        if (set.contains(mN.add(d.multiply2())) && set.contains(mN.add(d.multiply(3))) && set.contains(mN.add(d.multiply(4))) && set.contains(mN.add(d.multiply(5)))) {
          ++mM; // Found an AP-5 starting with mN
        }
      }
    }
    --mM;
    return mN;
  }
}
