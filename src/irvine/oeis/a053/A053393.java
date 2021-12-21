package irvine.oeis.a053;

import java.util.HashSet;

import irvine.math.z.Z;

/**
 * A053393.
 * @author Sean A. Irvine
 */
public class A053393 extends A053392 {

  // Note all known terms have period <= 3
  private static final int HEURISTIC_LIMIT = 10;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN);
      final HashSet<Z> seen = new HashSet<>();
      Z t = s;
      do {
        t = step(t);
        if (t.equals(s)) {
          return s;
        }
      } while (seen.add(t) && seen.size() < HEURISTIC_LIMIT);
    }
  }
}

