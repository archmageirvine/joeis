package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077092 Fixed points of iteration in A077091.
 * @author Sean A. Irvine
 */
public class A077092 extends Sequence1 {

  private long mN = -1;

  private Z f(final Z n) {
    return Functions.PHI.z(Functions.SIGMA1.z(n).subtract(Functions.PHI.z(n)));
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN);
      if (t.isZero() || t.equals(f(t))) {
        return t;
      }
    }
  }
}

