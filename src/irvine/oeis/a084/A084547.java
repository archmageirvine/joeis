package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

public class A084547 extends Sequence1 {

  private long mN = 0;

  /**
   * A084547 Numbers k that have primitive roots less than k that are nonnegative perfect cubes.
   * @author Sean A. Irvine
   */
  private boolean is(final long n) {
    // Primitive roots only exist for n = 1, 2, 4, p^k, 2*p^k (p odd prime)
    if (n == 2) {
      return true;
    }
    if (n < 11) {
      return false;
    }
    if ((n & 3) == 0) {
      return false;
    }
    if (Functions.OMEGA.i(Functions.MAKE_ODD.l(n)) > 1) {
      return false;
    }
    final Z zn = Z.valueOf(n);
    final Z phi = Functions.PHI.z(n);
    final FactorSequence fsPhi = Jaguar.factor(phi);
    long k = 0;
    while (true) {
      final long cube = ++k * k * k;
      if (cube >= n) {
        break;
      }
      if (Functions.GCD.l(cube, n) != 1) {
        continue;
      }
      final Z c = Z.valueOf(cube);
      boolean isPrimitive = true;
      for (final Z p : fsPhi.toZArray()) {
        if (c.modPow(phi.divide(p), zn).isOne()) {
          isPrimitive = false;
          break;
        }
      }
      if (isPrimitive) {
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
