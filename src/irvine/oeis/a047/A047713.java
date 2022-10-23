package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047713 Euler-Jacobi pseudoprimes: 2^((n-1)/2) == (2 / n) mod n, where (2 / n) is a Jacobi symbol.
 * @author Sean A. Irvine
 */
public class A047713 extends Sequence1 {

  private Z mN = Z.valueOf(119);

  protected Z base() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        final Z r = base().modPow(mN.subtract(1).divide2(), mN);
        final int j = base().jacobi(mN);
        if (j == 1 && Z.ONE.equals(r)) {
          return mN;
        }
        if (j == -1 && mN.subtract(1).equals(r)) {
          return mN;
        }
      }
    }
  }
}
