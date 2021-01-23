package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003685 Number of Hamiltonian paths in P_3 X P_n.
 * @author Sean A. Irvine
 */
public class A003685 implements Sequence {

  private static final Z Z23 = Z.valueOf(23);
  private static final Z Z25 = Z.valueOf(25);
  private static final Z Z31 = Z.valueOf(31);
  private static final Z Z121 = Z.valueOf(121);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int m = mN / 2;
    if ((mN & 1) == 0) {
      if (m == 1) {
        return Z.EIGHT;
      }
      return Z121.shiftLeft(mN - 4).subtract(Z25.shiftLeft(m - 2)).subtract(Z.valueOf(m).shiftLeft(m + 2)).subtract(2);
    } else {
      if (m == 0) {
        return Z.ONE;
      }
      return Z121.shiftLeft(mN - 4).subtract(Z23.shiftLeft(m - 1)).subtract(Z31.multiply(m).shiftLeft(m - 2)).subtract(2);
    }
  }
}
