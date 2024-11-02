package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A072808 Smallest m such that sigma(m) mod phi(n) = n or 0 if no solution exists.
 * @author Sean A. Irvine
 */
public class A072808 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 1000;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (m < HEURISTIC * mN) {
      final long phi = Functions.PHI.l(++m);
      if (Functions.SIGMA1.z(m).mod(phi) == mN) {
        return Z.valueOf(m);
      }
    }
    return Z.ZERO;
  }
}
