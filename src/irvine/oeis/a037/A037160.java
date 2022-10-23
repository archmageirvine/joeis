package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037160 Squares in A037159.
 * @author Sean A. Irvine
 */
public class A037160 extends Sequence1 {

  private static final long HEURISTIC_MULTIPLIER = 1000;
  private Z mN = Z.valueOf(146);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      Z m = s;
      final Z heuristicLimit = m.multiply(HEURISTIC_MULTIPLIER);
      final TreeSet<Z> seen = new TreeSet<>();
      while (m.signum() >= 0 && seen.add(m) && m.compareTo(heuristicLimit) < 0) {
        if (m.isZero()) {
          return s;
        }
        m = m.multiply(3).subtract(Jaguar.factor(m).sigma());
      }
    }
  }
}
