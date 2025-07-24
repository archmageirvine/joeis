package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A078910 Let r+i*s be the sum of the distinct first-quadrant Gaussian integers dividing n; sequence gives r values.
 * @author Sean A. Irvine
 */
public class A078910 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Zi n) {
    return n.re();
  }

  @Override
  public Z next() {
    final Zi n = new Zi(++mN, 0);
    Zi sum = Zi.ZERO;
    // Not very efficient, essentially trial division
    for (long x = 1; x <= mN; ++x) {
      final long x2 = x * x;
      for (long y = 0; x2 + y * y <= mN * mN; ++y) {
        final Zi t = new Zi(x, y);
        final Zi r = n.divide(t);
        if (r.multiply(t).equals(n)) {
          sum = sum.add(t);
        }
      }
    }
    return select(sum);
  }
}
