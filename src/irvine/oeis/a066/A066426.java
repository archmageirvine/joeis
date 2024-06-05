package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066426 Conjectured values for a(n) = least natural number k such that phi(n+k) = phi(n) + phi(k), if k exists; otherwise 0.
 * @author Sean A. Irvine
 */
public class A066426 extends Sequence1 {

  private static final int HEURISTIC_MAX = 1000000;
  private int mN = 0;

  @Override
  public Z next() {
    final long phi = Functions.PHI.l((long) ++mN);
    for (int k = 1; k < HEURISTIC_MAX; ++k) {
      if (phi + Functions.PHI.l(k) == Functions.PHI.l((long) (mN + k))) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
