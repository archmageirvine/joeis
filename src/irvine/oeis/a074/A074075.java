package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a033.A033313;

/**
 * A074075 Values of m corresponding to the minimization problem of A074074.
 * @author Sean A. Irvine
 */
public class A074075 extends A033313 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int bestM = 0;
    Z min = Z.NEG_ONE;
    for (int m = 1; m <= mN; ++m) {
      final Z d = Z.valueOf(2L * mN + 1 + 2L * m).multiply(2L * mN + 1 - 2L * m);
      final Z x = select(solvePell(d));
      if (min.equals(Z.NEG_ONE) || (x.signum() > 0 && x.compareTo(min) < 0)) {
        min = x;
        bestM = m;
      }
    }
    return Z.valueOf(bestM);
  }
}
