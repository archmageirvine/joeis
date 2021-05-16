package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047713 Euler-Jacobi pseudoprimes: 2^((n-1)/2) == (2 / n) mod n, where (2 / n) is a Jacobi symbol.
 * @author Sean A. Irvine
 */
public class A047713 implements Sequence {

  private Z mN = Z.valueOf(559);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        final Z r = Z.TWO.modPow(mN.subtract(1).divide2(), mN);
        final int j = Z.TWO.jacobi(mN);
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
