package irvine.oeis.a058;

import java.util.HashSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058811 Number of terms on the n-th level of the Inverse-Totient-Tree (ITT). The 0th, 1st, 2nd and 3rd levels are {1}, {2}, {3, 4, 6}, {5, 7, 8, 9, 10, 12, 14, 18} with 1, 1, 3, 8 entries resp. The (n+1)-st level is obtained from the n-th level as the union of the inverse phi sets of the terms occurring earlier on the n-th level.
 * @author Sean A. Irvine
 */
public class A058811 extends Sequence0 {

  private HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
    } else {
      final HashSet<Z> t = new HashSet<>();
      for (final Z u : mA) {
        t.addAll(Euler.inversePhi(u));
      }
      t.remove(Z.ONE);
      mA = t;
    }
    return Z.valueOf(mA.size());
  }
}
