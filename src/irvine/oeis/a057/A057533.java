package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057533 Values of n for which iteration of Chowla's function loops.
 * @author Sean A. Irvine
 */
public class A057533 extends Sequence1 {

  private long mN = 47;

  private Z step(final Z n) {
    return Functions.SIGMA.z(n).subtract(n).subtract(1);
  }

  @Override
  public Z next() {
    while (true) {
      final TreeSet<Z> seen = new TreeSet<>();
      Z m = Z.valueOf(++mN);
      while (seen.add(m)) {
        m = step(m);
      }
      if (!m.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
