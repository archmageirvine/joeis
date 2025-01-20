package irvine.oeis.a058;

import java.util.HashSet;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058811 Number of nodes at the n-th level of the Inverse-Totient-Tree (ITT) with the root at 1, and edges connecting number m to all numbers k such that phi(k) = m.
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
        t.addAll(InverseEuler.inversePhi(u));
      }
      t.remove(Z.ONE);
      mA = t;
    }
    return Z.valueOf(mA.size());
  }
}
