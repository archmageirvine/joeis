package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A075405 a(n)^2 is the square obtained in A075404 (or 0 if no such square exists).
 * @author Sean A. Irvine
 */
public class A075405 extends Sequence1 implements Conjectural {

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
        return sum.sqrt();
      }
    }
    return Z.ZERO;
  }
}
