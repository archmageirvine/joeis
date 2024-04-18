package irvine.oeis.a050;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050516 Increments in arithmetic progression of at least 5 terms having the same value of phi in A050515.
 * @author Sean A. Irvine
 */
public class A050516 extends Sequence1 {

  private Z mN = Z.valueOf(353639);
  private final ArrayList<Z> mD = new ArrayList<>();

  @Override
  public Z next() {
    while (mD.isEmpty()) {
      mN = mN.add(1);
      final Z phi = Functions.PHI.z(mN);
      final TreeSet<Z> set = InverseEuler.inversePhi(phi);
      while (!set.first().equals(mN)) {
        set.pollFirst();
      }
      set.pollFirst(); // remove mN itself
      while (set.size() >= 4) {
        final Z d = set.pollFirst().subtract(mN);
        if (set.contains(mN.add(d.multiply2())) && set.contains(mN.add(d.multiply(3))) && set.contains(mN.add(d.multiply(4)))) {
          mD.add(d);
        }
      }
    }
    return mD.remove(0);
  }
}
