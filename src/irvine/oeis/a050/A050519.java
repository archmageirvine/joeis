package irvine.oeis.a050;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050519 Increments of arithmetic progression of at least 6 terms having the same value of phi in A050518.
 * @author Sean A. Irvine
 */
public class A050519 implements Sequence {

  private Z mN = Z.valueOf(583199);
  private final ArrayList<Z> mD = new ArrayList<>();

  @Override
  public Z next() {
    while (mD.isEmpty()) {
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
          mD.add(d);
        }
      }
    }
    return mD.remove(0);
  }
}
