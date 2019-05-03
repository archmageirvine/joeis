package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005835 Pseudoperfect <code>(or semiperfect)</code> numbers n: some subset of the proper divisors of n sums to n.
 * @author Sean A. Irvine
 */
public class A005835 implements Sequence {

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
      final Z[] d = Cheetah.factor(++mN).divisors();
      if (isPseudoperfect(d, d.length - 1, Z.ZERO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
