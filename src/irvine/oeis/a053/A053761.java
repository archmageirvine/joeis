package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053761 Least positive integer k for which the Jacobi symbol (k|2*n-1) is less than 1, where 2*n-1 is a nonsquare; a(n)=0 if 2*n-1 is a square.
 * @author Sean A. Irvine
 */
public class A053761 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    if (mN.isSquare()) {
      return Z.ZERO;
    }
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (m.jacobi(mN) < 1) {
        return m;
      }
    }
  }
}
