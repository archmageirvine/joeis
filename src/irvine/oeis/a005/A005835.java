package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005835 Pseudoperfect (or semiperfect) numbers n: some subset of the proper divisors of n sums to n.
 * @author Sean A. Irvine
 */
public class A005835 extends Sequence1 {

  private long mN = 5;

  private boolean isPseudoperfect(final Z[] d, final int pos, final Z sum) {
    final int c = sum.compareTo(d[d.length - 1]);
    if (c >= 0) {
      return c == 0;
    }
    for (int k = pos - 1; k >= 0; --k) {
      if (isPseudoperfect(d, k, sum.add(d[k]))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      if (isPseudoperfect(d, d.length - 1, Z.ZERO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
