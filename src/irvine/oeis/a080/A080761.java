package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080761 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 10;
  private long mN = 0;

  private boolean is(final long n) {
    for (long x = 1; x < n * HEURISTIC; ++x) {
      if (Z.valueOf(x).pow(3).add(n).isSquare()) {
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
