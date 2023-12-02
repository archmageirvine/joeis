package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067069 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 50;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean ok = true;
      for (int k = 1; k <= HEURISTIC; ++k) {
        long r = 0;
        final long q = mN * k * k + 1;
        for (long x = 0; x <= LongUtils.sqrt(q); ++x) {
          for (long y = 0; y <= LongUtils.sqrt((q - x * x) / mN); ++y) {
            if (x * x + mN * y * y == q) {
              ++r;
            }
          }
        }
        final long d = Jaguar.factor(q).sigma0AsLong();
        final long s = (LongUtils.isSquare(q) ? d + 1 : d) / 2;
        if (r != s) {
          ok = false;
          break;
        }
      }

      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
