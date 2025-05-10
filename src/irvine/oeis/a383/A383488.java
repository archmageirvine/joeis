package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383488 Numbers k that have at least one divisor d_i(k) for which a divisor d_j(k) exists such that d_i(k) &lt; d_j(k) &lt; sigma(d_i(k)).
 * @author Sean A. Irvine
 */
public class A383488 extends Sequence1 {

  private long mN = 11;

  protected boolean is(final long n) {
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    for (int k = 0; k < d.length - 1; ++k) {
      final Z s = Functions.SIGMA1.z(d[k]);
      if (d[k + 1].compareTo(s) < 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

