package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057533 Values of n for which iteration of Chowla's function loops.
 * @author Sean A. Irvine
 */
public class A057533 implements Sequence {

  private long mN = 47;

  private Z step(final Z n) {
    return Jaguar.factor(n).sigma().subtract(n).subtract(1);
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
