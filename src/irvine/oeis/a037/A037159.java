package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037159 Consider the trajectory of n under the iteration of a map which sends x to 3x - sigma(x) if this is &gt;= 0; otherwise the iteration stops. The sequence gives values of n which eventually reach 0.
 * @author Sean A. Irvine
 */
public class A037159 implements Sequence {

  private static final long HEURISTIC_MULTIPLIER = 1000;
  private Z mN = Z.valueOf(81);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z m = mN;
      final Z heuristicLimit = mN.multiply(HEURISTIC_MULTIPLIER);
      final TreeSet<Z> seen = new TreeSet<>();
      while (m.signum() >= 0 && seen.add(m) && m.compareTo(heuristicLimit) < 0) {
        if (m.isZero()) {
          return mN;
        }
        m = m.multiply(3).subtract(Jaguar.factor(m).sigma());
      }
    }
  }
}
