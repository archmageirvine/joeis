package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A075404 Smallest m &gt; n such that Sum_{i=n..m} i^2 is a square, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A075406 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 4000;
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final long lim = mN * HEURISTIC;
    Z sum = Z.valueOf(m).square();
    while (m < lim) {
      sum = sum.add(Z.valueOf(++m).square());
      if (sum.isSquare()) {
        return Z.valueOf(m - mN + 1);
      }
    }
    return Z.ZERO;
  }
}
