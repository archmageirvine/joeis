package irvine.oeis.a078;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A078908 Let r+i*s be the sum, with multiplicity, of the first-quadrant Gaussian primes dividing n; sequence gives r values (with a(1) = 0).
 * @author Sean A. Irvine
 */
public class A078908 extends Sequence1 implements DirectSequence {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private int mN = 0;

  protected Z select(final Zi n) {
    return n.re();
  }

  private long valuation(final Zi n, final Zi t) {
    long cnt = 0;
    Zi m = n;
    while (true) {
      final Zi r = m.divide(t);
      if (!r.multiply(t).equals(m)) {
        return cnt;
      }
      ++cnt;
      m = r;
    }
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z m) {
    return a(m.intValueExact());
  }

  @Override
  public Z a(final int m) {
    final Zi n = new Zi(m, 0);
    Zi sum = Zi.ZERO;
    // Not very efficient, essentially trial division
    for (int x = 1; x <= m; ++x) {
      final int x2 = x * x;
      for (int y = 0; x2 + y * y <= m * m; ++y) {
        final Zi t = new Zi(x, y);
        if (G.isProbablePrime(t)) {
          sum = sum.add(t.multiply(valuation(n, t)));
        }
      }
    }
    return select(sum);
  }
}
