package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389480 Triangle read by rows where T(n,k) is the algebraic degree of cos(k*Pi/n).
 * @author Sean A. Irvine
 */
public class A389480 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    if (m == 0 || n == m || n == 2 * m) {
      return Z.ONE;
    }
    final long g = n / Functions.GCD.l(n, m);
    return Functions.PHI.z(g).divide(1 + (g & 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
