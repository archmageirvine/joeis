package irvine.oeis.a333;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;

/**
 * A333633 Smallest m such that sigma(m) == 2*n (mod phi(m)) or 0 if no solution exists.
 * @author Georg Fischer
 */
public class A333633 extends Sequence0 implements Conjectural {

  private static final long HEURISTIC = 70000000;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    ;
    final long n = 2 * mN;
    long m = 1;
    while (m < HEURISTIC) {
      final long phi = Functions.PHI.l(++m);
      if (Functions.SIGMA1.z(m).mod(phi) == n) {
        return Z.valueOf(m);
      }
    }
    return Z.ZERO;
  }
}
