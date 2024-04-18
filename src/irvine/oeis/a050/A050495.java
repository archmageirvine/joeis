package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050495 Numbers that are the first term of at least one arithmetic progression with 4 or more terms all having the same value of Euler's totient function phi(x).
 * @author Sean A. Irvine
 */
public class A050495 extends Sequence1 {

  private Z mN = Z.valueOf(71);
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
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
          ++mM; // Found an AP-4 starting with mN
        }
      }
    }
    --mM;
    return mN;
  }
}
