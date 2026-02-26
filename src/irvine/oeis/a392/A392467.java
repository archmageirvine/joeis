package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392467 allocated for B Mittou.
 * @author Sean A. Irvine
 */
public class A392467 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    Z[] sums = {Z.ZERO, Z.ZERO};
    int j = 1;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      sums[j] = sums[j].add(d);
      j = 1 - j;
    }
    return sums[0].mod(sums[1]).isZero();
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
