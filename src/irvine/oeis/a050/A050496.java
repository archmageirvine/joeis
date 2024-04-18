package irvine.oeis.a050;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050496 Increments in arithmetic progressions of at least 4 terms having the same value of phi(x) in A050495.
 * @author Sean A. Irvine
 */
public class A050496 extends Sequence1 {

  private Z mN = Z.valueOf(71);
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
      while (set.size() >= 3) {
        final Z d = set.pollFirst().subtract(mN);
        if (set.contains(mN.add(d.multiply2())) && set.contains(mN.add(d.multiply(3)))) {
          mD.add(d);
        }
      }
    }
    return mD.remove(0);
  }
}
