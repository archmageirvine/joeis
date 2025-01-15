package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A074197 Let b(1) = n, b(k+1) = b(k)/2 + k if b(k) is even, b(k+1) = b(k)-k otherwise; sequence gives values of b(1) = n such that b(k) = 2k-4 for k large enough.
 * @author Sean A. Irvine
 */
public class A074197 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 1000;
  private long mN = 0;

  private boolean is(final long n) {
    Z m = Z.valueOf(n);
    for (long k = 1; k < HEURISTIC; ++k) {
      if (m.isEven()) {
        m = m.divide2().add(k);
      } else {
        m = m.subtract(k);
      }
      if (m.equals(Z.valueOf(2 * k - 2))) {
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
